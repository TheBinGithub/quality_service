package com.ncvt.quality.entity;

import lombok.Data;

@Data
public class IncomingCheckEntity {

    private String igckId;  // 来料检验id
    private String pgltId;  // 领料id
    private String checkNumber;  // 检验数量
    private String checkValue;  // 检验值
    private String checkResult;  // 检验结果
    private String checkPeople;  // 检验人
    private String checkDate;  // 检验时间

}
