package com.ncvt.quality.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ncvt.quality.mapper.IncomingCheckMapper;
import com.ncvt.quality.params.IncomingCheckData;
import com.ncvt.quality.params.IncomingCheckParams;
import com.ncvt.quality.params.QueryIncomingCheckParams;
import com.ncvt.quality.service.IncomingCheckService;
import com.ncvt.quality.util.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class IncomingCheckServiceImpl implements IncomingCheckService {

    @Resource
    private IncomingCheckMapper incomingCheckMapper;

    @Override
    public Result add(IncomingCheckParams params) {
        try {
            int result = incomingCheckMapper.add(params);
            if (result != 1) return Result.fail(300, "添加出现未知异常！");
            return Result.ok("添加成功！", params);
        }catch (Exception e){
            log.info("异常："+e);
            return Result.fail("服务端异常！", e.getMessage());
        }
    }

    @Override
    public Result delete(String igckId) {
        try {
            int result = incomingCheckMapper.delete(igckId);
            if (result != 1) return Result.fail(300, "删除出现未知异常！");
            return Result.ok("删除成功！");
        }catch (Exception e){
            log.info("异常："+e);
            return Result.fail("服务端异常！", e.getMessage());
        }
    }

    @Override
    public Result query(Integer page, QueryIncomingCheckParams params) {
        try {
            PageHelper.startPage(page,10);
            List<IncomingCheckData> queryList = incomingCheckMapper.query(params);
            PageInfo lists = new PageInfo(queryList);
            if (queryList.toArray().length == 0) return Result.fail(300, "查询无结果！");
            return Result.ok("查询成功！", lists);
        }catch (Exception e){
            log.info("异常："+e);
            return Result.fail("服务端异常！",e.getMessage());
        }
    }

    @Override
    public Result update(String igckId, IncomingCheckParams params) {
        try {
            params.setIgckId(igckId);
            int result = incomingCheckMapper.update(params);
            if (result != 1) return Result.fail(300, "修改出现未知异常！");
            return Result.ok("修改成功！", params);
        }catch (Exception e){
            log.info("异常："+e);
            return Result.fail("服务端异常！",e.getMessage());
        }
    }
}
