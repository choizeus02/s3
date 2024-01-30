package com.choizeus.s3Test.s3.dto.mediaconverter;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter @Setter
public class AwsMediaConvertForm {
    private String id;
    private String region;
    private AwsMediaConvertDetailForm detail;
}
