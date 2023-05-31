package com.ncvt.quality.mapper;

import com.ncvt.quality.params.IncomingCheckData;
import com.ncvt.quality.params.IncomingCheckParams;
import com.ncvt.quality.params.QueryIncomingCheckParams;

import java.util.List;

public interface IncomingCheckMapper {

    // 新增
    Integer add(IncomingCheckParams params);

    // 删除
    Integer delete(String igckId);

    // 查询
    List<IncomingCheckData> query(QueryIncomingCheckParams params);

    //修改
    Integer update(IncomingCheckParams params);

}
