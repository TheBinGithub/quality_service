package com.ncvt.quality.mapper;

import com.ncvt.quality.entity.ErrorEntity;
import com.ncvt.quality.params.ErrorParams;

import java.util.List;

public interface ErrorMapper {

    // 新增
    Integer add(ErrorParams params);

    // 删除
    Integer delete(String errorId);

    // 查询全部
    List<ErrorEntity> queryAll();

    //修改
    Integer update(ErrorParams params);

}
