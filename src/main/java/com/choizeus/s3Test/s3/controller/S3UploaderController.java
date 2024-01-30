package com.choizeus.s3Test.s3.controller;


import com.choizeus.s3Test.s3.service.S3UploaderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RequiredArgsConstructor
@Controller
public class S3UploaderController {
    private final S3UploaderService s3UploaderService;

    @GetMapping("/image")
    public String image() {
        return "image-upload";
    }

    @GetMapping("/video")
    public String video() {
        return "video-upload";
    }

    @PostMapping("/image-upload")
    @ResponseBody
    public String imageUpload(@RequestParam("data") MultipartFile multipartFile) throws IOException {
        return s3UploaderService.upload(multipartFile, "smu-capstone-bucket1", "images");
    }

    @PostMapping("/video-upload")
    @ResponseBody
    public String videoUpload(@RequestParam("data") MultipartFile multipartFile) throws IOException {
        return s3UploaderService.upload(multipartFile, "smu-capstone-bucket1", "videos");
    }
}