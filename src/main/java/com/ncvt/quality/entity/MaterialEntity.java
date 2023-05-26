package com.ncvt.quality.entity;


import lombok.Data;

@Data
public class MaterialEntity {

    private String matId;  // 物料id
    private String pr;  // 物料名称
    private String pml;  // 物料型号
    private String psn;  // 物料规格
    private String unit;  // 物料单位

}
