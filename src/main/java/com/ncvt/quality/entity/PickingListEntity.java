package com.ncvt.quality.entity;

import lombok.Data;

@Data
public class PickingListEntity {

    private String pgltId; // 领料id
    private String pipeliningId;  // 流水号
    private String checkId;  // 检验标准id
    private String demandNumber;  // 需求数量
    private String receivedNumber;  // 已领数量

}
