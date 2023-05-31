package com.ncvt.quality.service.impl;

import com.ncvt.quality.entity.ProductionEntity;
import com.ncvt.quality.mapper.ProductionMapper;
import com.ncvt.quality.service.ProductionService;
import com.ncvt.quality.util.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class ProductionServiceImpl implements ProductionService {

    @Resource
    private ProductionMapper productionMapper;

    @Override
    public Result query() {
        try {
            List<ProductionEntity> list = productionMapper.query();
            if (list.toArray().length == 0) return Result.fail(300, "查询无记录！");
            return Result.ok("查询成功！");
        }catch (Exception e){
            log.info("异常："+e);
            return Result.fail("服务端异常！", e.getMessage());
        }
    }

}
