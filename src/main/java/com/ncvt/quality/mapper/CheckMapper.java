package com.ncvt.quality.mapper;


import com.ncvt.quality.entity.CheckoutEntity;
import com.ncvt.quality.params.CheckParams;
import com.ncvt.quality.params.QualityInspection;

import java.util.List;

public interface CheckMapper {

    // 新增
    Integer add(CheckParams params);

    // 删除
    Integer delete(String checkId);

    // 查询总量
    List<CheckoutEntity> queryCount();

    // 查询
    List<QualityInspection> query(Integer page, String pr, String checkName, String checkType);

    //修改
    Integer update(CheckParams params);

}
