package com.ncvt.quality.service.impl;

import com.ncvt.quality.entity.MaterialEntity;
import com.ncvt.quality.mapper.MaterialMapper;
import com.ncvt.quality.service.MaterialService;
import com.ncvt.quality.util.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class MaterialServiceImpl implements MaterialService {

    @Resource
    private MaterialMapper materialMapper;

    @Override
    public Result query() {
        try {
            List<MaterialEntity> lists = materialMapper.query();
            if (lists.toArray().length == 0) return Result.fail(300, "查询无记录！");
            return Result.ok("查询成功！", lists);
        }catch (Exception e){
            log.info("异常："+e);
            return Result.fail("服务端异常！", e.getMessage());
        }
    }
}
