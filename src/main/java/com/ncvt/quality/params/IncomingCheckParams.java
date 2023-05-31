package com.ncvt.quality.params;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class IncomingCheckParams {

    private String igckId;  // 来料检验id
    @ApiModelProperty(value = "领料id", required = true)
    private String pgltId;
    @ApiModelProperty(value = "检验数量", required = true)
    private String checkNumber;
    @ApiModelProperty(value = "检验值", required = true)
    private String checkValue;
    @ApiModelProperty(value = "检验结果", required = true)
    private String checkResult;
    @ApiModelProperty(value = "检验人", required = true)
    private String checkPeople;
    @ApiModelProperty(value = "检验时间", required = true)
    private String checkDate;

}
