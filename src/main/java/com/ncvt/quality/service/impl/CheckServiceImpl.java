package com.ncvt.quality.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ncvt.quality.mapper.CheckMapper;
import com.ncvt.quality.params.CheckParams;
import com.ncvt.quality.params.QualityInspection;
import com.ncvt.quality.service.CheckService;
import com.ncvt.quality.util.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@Slf4j
public class CheckServiceImpl implements CheckService {

    // 当前项目去除后端全部非必要性判空,无视空指针异常,请在前端约束接口传参

    @Resource
    private CheckMapper checkMapper;

    // 添加
    @Override
    public Result add(CheckParams params) {
        try {
            int result = checkMapper.add(params);
            if (result != 1) return Result.fail(300, "添加出现未知异常！");
            return Result.ok("添加成功！", params);
        }catch (Exception e){
            log.info("异常："+e);
            return Result.fail("服务端异常！", e.getMessage());
        }
    }

    // 删除
    @Override
    public Result delete(String checkId) {
        try {
            int result = checkMapper.delete(checkId);
            if (result != 1) return Result.fail(300, "删除出现未知异常！");
            return Result.ok("删除成功！");
        }catch (Exception e){
            log.info("异常："+e);
            return Result.fail("服务端异常！", e.getMessage());
        }
    }

    // 查询
    @Override
    public Result query(Integer page, String pr, String checkName, String checkType) {
        try {
            PageHelper.startPage(page,10);
            List<QualityInspection> queryLists = checkMapper.query(pr, checkName, checkType);
            if (queryLists.toArray().length == 0) return Result.fail(300, "查询无记录！");
            List<String> l = Arrays.asList(pr, checkName, checkType);
            for (String s : l){
                if (!s.equals("@-.@")) queryLists.get(0).setConditions(true);
            }
            PageInfo lists = new PageInfo(queryLists);
            return Result.ok("查询成功！", lists);
        }catch (Exception e){
            log.info("异常："+e);
            return Result.fail("服务端异常！", e.getMessage());
        }
    }

    // 修改
    @Override
    public Result update(String checkId, CheckParams params) {
        try {
            params.setCheckId(checkId);
            int result = checkMapper.update(params);
            if (result != 1) return Result.fail(300, "修改出现未知异常！");
            return Result.ok("修改成功！", params);
        }catch (Exception e){
            log.info("异常："+e);
            return Result.fail("服务端异常！",e.getMessage());
        }
    }
}
