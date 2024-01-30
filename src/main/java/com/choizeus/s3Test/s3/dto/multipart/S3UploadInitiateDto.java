package com.choizeus.s3Test.s3.dto.multipart;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter @Setter
public class S3UploadInitiateDto {
    // 업로드할 파일의 originFileName
    private String fileName;
}
