package com.choizeus.s3Test.s3.controller;


import com.choizeus.s3Test.s3.config.S3Config;
import com.choizeus.s3Test.s3.dto.S3UploadDto;
import com.choizeus.s3Test.s3.dto.multipart.*;
import com.choizeus.s3Test.s3.service.S3MultipartService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class S3MultipartController {
    private final S3MultipartService s3MultipartService;

    @Value("${cloud.aws.s3.bucket}")
    private String videoBucket;

    /**
     * 멀티파트 업로드 시작한다.
     * 업로드 아이디를 반환하는데, 업로드 아이디는 부분 업로드, 업로드 완료 및 중지할 때 사용된다.
     * @param s3UploadInitiateDto
     * @return
     */
    @PostMapping("/initiate-upload")
    public S3UploadDto initiateUpload(@RequestBody S3UploadInitiateDto s3UploadInitiateDto) {
        return s3MultipartService.initiateUpload(s3UploadInitiateDto.getFileName(), videoBucket, S3Config.videoFolder);
    }

    /**
     * 부분 업로드를 위한 서명된 URL 발급 요청
     * @param s3UploadSignedUrlDto
     * @return
     */
    @PostMapping("/upload-signed-url")
    public S3PresignedUrlDto getUploadSignedUrl(@RequestBody S3UploadSignedUrlDto s3UploadSignedUrlDto) {
        return s3MultipartService.getUploadSignedUrl(s3UploadSignedUrlDto, videoBucket,S3Config.videoFolder);
    }

    /**
     * 멀티파트 업로드 완료 요청
     * @param s3UploadCompleteDto
     * @return
     */
    @PostMapping("/complete-upload")
    public S3UploadResultDto completeUpload(@RequestBody S3UploadCompleteDto s3UploadCompleteDto) {
        return s3MultipartService.completeUpload(s3UploadCompleteDto, videoBucket, S3Config.videoFolder);
    }

    /**
     * 멀티파트 업로드 중지
     * @param s3UploadAbortDto
     * @return
     */
    @PostMapping("/abort-upload")
    public Void abortUpload(@RequestBody S3UploadAbortDto s3UploadAbortDto) {
        s3MultipartService.abortUpload(s3UploadAbortDto, videoBucket, S3Config.videoFolder);
        return null;
    }
}