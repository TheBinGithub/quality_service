package com.ncvt.quality.params;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class SamplingAddParams {

    private String samplingId;  // 采样编号
    @ApiModelProperty(value = "生产id", required = true)
    private String prodId;
    @ApiModelProperty(value = "检验id", required = true)
    private String checkId;
    @ApiModelProperty(value = "采样数量", required = true)
    private String samplingNumber;
    @ApiModelProperty(value = "检验值", required = true)
    private String checkValue;
    @ApiModelProperty(value = "检验结果", required = true)
    private String checkResult;
    @ApiModelProperty(value = "检验人", required = true)
    private String checkPeople;
    @ApiModelProperty(value = "检验时间", required = true)
    private String checkDate;

}
