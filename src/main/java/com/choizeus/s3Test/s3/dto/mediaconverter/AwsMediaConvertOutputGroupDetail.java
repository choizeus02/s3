package com.choizeus.s3Test.s3.dto.mediaconverter;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class AwsMediaConvertOutputGroupDetail {
    private List<AwsMediaConvertOutputDetail> outputDetails;
}
