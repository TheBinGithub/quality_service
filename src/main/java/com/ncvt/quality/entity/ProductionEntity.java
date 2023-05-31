package com.ncvt.quality.entity;

import lombok.Data;

@Data
public class ProductionEntity {

    private String prodId;  // 生产id
    private String pipeliningId;  // 流水号
    private String planId;  // 计划编号
    private String jobName;  // 作业名称
    private String prodName;  // 产线名称
    private String matId;  // 产品名称(物料名称、规格、型号、单位)
    private String prodNumber;  // 生产数量
    private String prodDate;  // 生产时间

}
