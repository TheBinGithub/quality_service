package com.ncvt.quality.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ncvt.quality.entity.ErrorEntity;
import com.ncvt.quality.mapper.ErrorMapper;
import com.ncvt.quality.params.ErrorParams;
import com.ncvt.quality.service.ErrorService;
import com.ncvt.quality.util.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class ErrorServiceImpl implements ErrorService {

    @Resource
    private ErrorMapper errorMapper;

    @Override
    public Result add(ErrorParams params) {
        try {
            int result = errorMapper.add(params);
            if (result != 1) return Result.fail(300, "添加出现未知异常！");
            return Result.ok("添加成功！", params);
        }catch (Exception e){
            log.info("异常："+e);
            return Result.fail("服务端异常！", e.getMessage());
        }
    }

    @Override
    public Result delete(String errorId) {
        try {
            int result = errorMapper.delete(errorId);
            if (result != 1) return Result.fail(300, "删除出现未知异常！");
            return Result.ok("删除成功！");
        }catch (Exception e){
            log.info("异常："+e);
            return Result.fail("服务端异常！", e.getMessage());
        }
    }

    @Override
    public Result queryAll(Integer page) {
        try {
            PageHelper.startPage(page,10);
            List<ErrorEntity> queryList = errorMapper.queryAll();
            PageInfo lists = new PageInfo(queryList);
            if (queryList.toArray().length == 0) return Result.fail(300, "查询无结果！");
            return Result.ok("查询成功！", lists);
        }catch (Exception e){
            log.info("异常："+e);
            return Result.fail("服务端异常！",e.getMessage());
        }
    }

    @Override
    public Result update(String errorId, ErrorParams params) {
        try {
            params.setErrorId(errorId);
            int result = errorMapper.update(params);
            if (result != 1) return Result.fail(300, "修改出现未知异常！");
            return Result.ok("修改成功！", params);
        }catch (Exception e){
            log.info("异常："+e);
            return Result.fail("服务端异常！",e.getMessage());
        }
    }

}
