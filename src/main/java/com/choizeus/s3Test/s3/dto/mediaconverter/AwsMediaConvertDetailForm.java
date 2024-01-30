package com.choizeus.s3Test.s3.dto.mediaconverter;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class AwsMediaConvertDetailForm {
    private String status;
    private AwsMediaConvertDetailUserMetadataForm userMetadata;
    private AwsMediaConvertJobProgressForm jobProgress;
    private List<AwsMediaConvertOutputGroupDetail> outputGroupDetails;
}