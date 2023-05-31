package com.ncvt.quality.params;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class QueryIncomingCheckParams {

    @ApiModelProperty(value = "流水号", required = true)
    private String pipeliningId;
    @ApiModelProperty(value = "领料单号", required = true)
    private String pgltId;
    @ApiModelProperty(value = "物料名称", required = true)
    private String pr;
    @ApiModelProperty(value = "检验人", required = true)
    private String checkPeople;
    @ApiModelProperty(value = "检验时间", required = true)
    private String checkDate;

}
