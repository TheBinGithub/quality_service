package com.ncvt.quality.mapper;

import com.ncvt.quality.entity.SamplingEntity;
import com.ncvt.quality.params.SampleData;
import com.ncvt.quality.params.SamplingAddParams;
import com.ncvt.quality.params.SamplingQueryParams;

import java.util.List;

public interface SamplingMapper {

    // 添加
    Integer add(SamplingAddParams params);

    // 删除
    Integer delete(String samplingId);

    // 查询
    List<SampleData> query(SamplingQueryParams samplingQueryParams);

    // 修改
    Integer update(SamplingAddParams params);

}
