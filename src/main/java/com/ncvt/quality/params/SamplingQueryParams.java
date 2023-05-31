package com.ncvt.quality.params;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class SamplingQueryParams {

//    @ApiModelProperty(value = "页码", required = true)
//    public Integer page;
    @ApiModelProperty(value = "流水号", required = true)
    public String pipeliningId;
    @ApiModelProperty(value = "计划编号", required = true)
    public String planId;
    @ApiModelProperty(value = "作业名称", required = true)
    public String jobName;
    @ApiModelProperty(value = "物料名称", required = true)
    public String pr;
    @ApiModelProperty(value = "检验项", required = true)
    public String checkName;
    @ApiModelProperty(value = "检验结果", required = true)
    public String checkResult;
    @ApiModelProperty(value = "检验人", required = true)
    public String checkPeople;
    @ApiModelProperty(value = "检验时间", required = true)
    public String checkDate;

}
