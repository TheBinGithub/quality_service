package com.ncvt.quality.mapper;


import com.ncvt.quality.entity.CheckEntity;
import com.ncvt.quality.params.CheckParams;
import com.ncvt.quality.params.QualityInspection;

import java.util.List;

public interface CheckMapper {

    // 新增
    Integer add(CheckParams params);

    // 删除
    Integer delete(String checkId);

    // 查询总量
    List<CheckEntity> queryCount();

    // 查询
    List<QualityInspection> query(String pr, String checkName, String checkType);

    //修改
    Integer update(CheckParams params);

}
