package com.ncvt.quality.service;

import com.ncvt.quality.params.ErrorParams;
import com.ncvt.quality.util.Result;

public interface ErrorService {

    // 新增
    Result add(ErrorParams params);

    // 删除
    Result delete(String errorId);

    // 查询总量
    Result queryAll(Integer page);

    //修改
    Result update(String errorId, ErrorParams params);

}
