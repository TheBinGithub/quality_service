package com.ncvt.quality.service;

import com.ncvt.quality.params.SamplingAddParams;
import com.ncvt.quality.params.SamplingQueryParams;
import com.ncvt.quality.util.Result;

public interface SamplingService {

    // 添加
    Result add(SamplingAddParams params);

    // 删除
    Result delete(String samplingId);

    // 查询
    Result query(Integer page, SamplingQueryParams params);

    // 修改
    Result update(SamplingAddParams params);

}
