package com.ncvt.quality.params;

import lombok.Data;

@Data
public class SampleData {

    private boolean conditions = false;  // 是否条件
    private String samplingId;  // 采样编号
    private String pipeliningId;  // 流水号
    private String planId;  // 计划编号
    private String jobName;  // 作业名称
    private String pr;  // 物料名称
    private String pml;  // 物料型号
    private String psn;  // 物料规格
    private String unit;  // 物料单位
    private String checkName;  // 检验名称
    private String prodNumber;  // 生产数量
    private String samplingNumber;  // 采样数量
    private String checkValue;  // 检验值
    private String maxStandard;  // 最大标准值
    private String minStandard;  // 最小标准值
    private String checkResult;  // 检验结果
    private String checkPeople;  // 检验人
    private String checkDate;  // 检验时间

}
