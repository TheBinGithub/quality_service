package com.ncvt.quality.service;

import com.ncvt.quality.params.IncomingCheckParams;
import com.ncvt.quality.params.QueryIncomingCheckParams;
import com.ncvt.quality.util.Result;

public interface IncomingCheckService {

    // 新增
    Result add(IncomingCheckParams params);

    // 删除
    Result delete(String igckId);

    // 查询
    Result query(Integer page, QueryIncomingCheckParams params);

    //修改
    Result update(String igckId, IncomingCheckParams params);

}
