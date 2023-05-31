package com.ncvt.quality.params;

import lombok.Data;

@Data
public class IncomingCheckData {

    private String igckId;  // 来料检验id
    private String pipeliningId;  // 流水号
    private String pgltId;  // 领料id
    private String pr;  // 物料名称
    private String pml;  // 物料型号
    private String psn;  // 物料规格
    private String unit;  // 物料单位
    private String demandNumber;  // 需求数量
    private String receivedNumber;  // 已领数量
    private String checkNumber;  // 检验数量
    private String checkName;  // 检验名称
    private String maxStandard;  // 最大标准值
    private String minStandard;  // 最小标准值
    private String checkValue;  // 检验值
    private String checkResult;  // 检验结果
    private String checkPeople;  // 检验人
    private String checkDate;  // 检验时间

}
