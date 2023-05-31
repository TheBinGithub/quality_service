package com.ncvt.quality.service.impl;

import com.ncvt.quality.entity.PickingListEntity;
import com.ncvt.quality.mapper.PickingListMapper;
import com.ncvt.quality.service.PickingListService;
import com.ncvt.quality.util.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class PickingListServiceimpl implements PickingListService {

    @Resource
    private PickingListMapper pickingListMapper;

    @Override
    public Result query() {
        try {
            List<PickingListEntity> list = pickingListMapper.query();
            if (list.toArray().length == 0) return Result.fail(300, "查询无记录！");
            return Result.ok("查询成功！");
        }catch (Exception e){
            log.info("异常："+e);
            return Result.fail("服务端异常！", e.getMessage());
        }
    }
}
