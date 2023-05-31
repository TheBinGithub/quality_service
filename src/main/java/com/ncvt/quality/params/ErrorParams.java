package com.ncvt.quality.params;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ErrorParams {

    private String errorId;  // 错误id
    @ApiModelProperty(value = "错误项", required = true)
    private String errorName;
    @ApiModelProperty(value = "错误类型", required = true)
    private String errorType;
    @ApiModelProperty(value = "导致结果", required = true)
    private String errorResult;
    @ApiModelProperty(value = "预防手段", required = true)
    private String prevention;

}
