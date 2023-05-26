package com.ncvt.quality.entity;

import lombok.Data;

@Data
public class CheckoutEntity {

    private String checkId;  // 检验id
    private String matId;  // 物料id
    private String checkName;  // 检验名称
    private String checkType;  // 检验类型
    private String maxStandard;  // 最大标准值
    private String minStandard;  // 最小标准值

}
