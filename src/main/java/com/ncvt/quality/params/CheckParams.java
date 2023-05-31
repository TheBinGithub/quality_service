package com.ncvt.quality.params;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class CheckParams {

    private String checkId;
    @ApiModelProperty(value = "物料id", required = true)
    private String matId;
    @ApiModelProperty(value = "检验名称", required = true)
    private String checkName;
    @ApiModelProperty(value = "检验类型", required = true)
    private String checkType;
    @ApiModelProperty(value = "最大标准值", required = true)
    private String maxStandard;
    @ApiModelProperty(value = "最小标准值", required = true)
    private String minStandard;

}
