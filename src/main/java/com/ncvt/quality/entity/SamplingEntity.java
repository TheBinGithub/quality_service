package com.ncvt.quality.entity;

import lombok.Data;

@Data
public class SamplingEntity {

    private String samplingId;  // 采样编号
    private String prodId;  // 生产id
    private String checkId;  // 检验id
    private String samplingNumber;  // 采样数量
    private String checkValue;  // 检验值
    private String checkResult;  // 检验结果
    private String checkPeople;  // 检验人
    private String checkDate;  // 检验时间

}