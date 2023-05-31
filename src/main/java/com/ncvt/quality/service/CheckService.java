package com.ncvt.quality.service;

import com.ncvt.quality.params.CheckParams;
import com.ncvt.quality.util.Result;

public interface CheckService {

    // 新增
    Result add(CheckParams params);

    // 删除
    Result delete(String checkId);

    // 查询
    Result query(Integer page, String pr, String checkName, String checkType);

    //修改
    Result update(String checkId, CheckParams params);

}
