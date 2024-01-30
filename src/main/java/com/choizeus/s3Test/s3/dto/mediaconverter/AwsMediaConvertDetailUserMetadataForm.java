package com.choizeus.s3Test.s3.dto.mediaconverter;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class AwsMediaConvertDetailUserMetadataForm {
    private String objectKey;
    private String targetId;
}
