package com.ncvt.quality.entity;

import lombok.Data;

@Data
public class ErrorEntity {

    private String errorId;  // 错误id
    private String errorName;  // 错误项
    private String errorType;  // 错误类型
    private String errorResult;  // 导致结果
    private String prevention;  // 预防手段

}
