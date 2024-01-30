package com.choizeus.s3Test.s3.controller;

import com.choizeus.s3Test.s3.dto.mediaconverter.AwsMediaConvertForm;
import com.choizeus.s3Test.s3.service.MediaConverterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class MediaConverterController {

    private final MediaConverterService mediaConverterService;

    @PostMapping("/video/status")
    public String subConvertComplete(@RequestBody AwsMediaConvertForm form) {
        mediaConverterService.subConvertComplete(form);
        return null;
    }
}
