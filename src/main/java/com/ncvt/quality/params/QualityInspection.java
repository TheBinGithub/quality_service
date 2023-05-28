package com.ncvt.quality.params;

import lombok.Data;

@Data
public class QualityInspection {

    private String count;  // 数据总量
    private String checkId;  // 检验id
    private String matId;  // 物料id
    private String pr;  // 物料名称
    private String pml;  // 物料型号
    private String psn;  // 物料规格
    private String unit;  // 物料单位
    private String checkName;  // 检验名称
    private String checkType;  // 检验类型
    private String maxStandard;  // 最大标准值
    private String minStandard;  // 最小标准值

}
