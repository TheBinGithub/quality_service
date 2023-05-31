package com.ncvt.quality.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ncvt.quality.entity.SamplingEntity;
import com.ncvt.quality.mapper.ProductionMapper;
import com.ncvt.quality.mapper.SamplingMapper;
import com.ncvt.quality.params.SampleData;
import com.ncvt.quality.params.SamplingAddParams;
import com.ncvt.quality.params.SamplingQueryParams;
import com.ncvt.quality.service.SamplingService;
import com.ncvt.quality.util.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

@Service
@Slf4j
public class SamplingServiceImpl implements SamplingService {

    @Resource
    private ProductionMapper productionMapper;

    @Resource
    private SamplingMapper samplingMapper;

    @Override
    public Result add(SamplingAddParams params) {
        try {
            int result = samplingMapper.add(params);
            if (result != 1) return Result.fail(300, "添加出现未知异常！");
            return Result.ok("添加成功！", params);
        }catch (Exception e){
            log.info("异常："+e);
            return Result.fail("服务端异常！", e.getMessage());
        }
    }

    @Override
    public Result delete(String samplingId) {
        try {
            int result = samplingMapper.delete(samplingId);
            if (result != 1) return Result.fail(300, "删除出现未知异常！");
            return Result.ok("删除成功！");
        }catch (Exception e){
            log.info("异常："+e);
            return Result.fail("服务端异常！", e.getMessage());
        }
    }

    @Override
    public Result query(Integer page, SamplingQueryParams params) {
        try {
            PageHelper.startPage(page,10);
            List<SampleData> queryLists = samplingMapper.query(params);
            if (queryLists.toArray().length == 0) return Result.fail(300, "查询无记录！");
            // 获取所有属性
            Field[] fields = params.getClass().getDeclaredFields();
            for (Field f : fields){
                if (!f.get(params).toString().equals("@-.@")) queryLists.get(0).setConditions(true);
            }
            PageInfo lists = new PageInfo(queryLists);
            return Result.ok("查询成功！", lists);
        }catch (Exception e){
            log.info("异常："+e);
            return Result.fail("服务端异常！", e.getMessage());
        }
    }

    @Override
    public Result update(SamplingAddParams params) {
        try {
            int result = samplingMapper.update(params);
            if (result != 1) return Result.fail(300, "修改出现未知异常！");
            return Result.ok("修改成功！", params);
        }catch (Exception e){
            log.info("异常："+e);
            return Result.fail("服务端异常！", e.getMessage());
        }
    }
}
