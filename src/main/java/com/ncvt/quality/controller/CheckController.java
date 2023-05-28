package com.ncvt.quality.controller;

import com.ncvt.quality.params.CheckParams;
import com.ncvt.quality.service.CheckService;
import com.ncvt.quality.util.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Api(tags = "质检标准模块")
@RestController
@Slf4j
public class CheckController {

    @Resource
    private CheckService checkService;

    @ApiOperation("添加质检数据")
    @PostMapping("/quality")
    public Object addQuality(@RequestBody CheckParams params){
        try {
            return checkService.add(params);
        }catch (Exception e){
            log.info("异常："+e);
            return Result.fail("请求服务器出现错误！", e.getMessage());
        }
    }

    @ApiOperation("删除质检数据")
    @DeleteMapping("/quality/{checkId}")
    public Object deleteQuality(@PathVariable String checkId){
        try {
            return checkService.delete(checkId);
        }catch (Exception e){
            log.info("异常："+e);
            return Result.fail("请求服务器出现错误！", e.getMessage());
        }
    }

    @ApiOperation("查询质检数据")
    @GetMapping("/quality/{page}/{pr}/{checkName}/{checkType}")
    public Object queryQuality(@PathVariable Integer page,
                               @PathVariable String pr,
                               @PathVariable String checkName,
                               @PathVariable String checkType){
        try {
            return checkService.query(page, pr, checkName, checkType);
        }catch (Exception e){
            log.info("异常："+e);
            return Result.fail("请求服务器出现错误！", e.getMessage());
        }
    }

    @ApiOperation("修改质检数据")
    @PatchMapping("/quality/{checkId}")
    public Object updateQuality(@PathVariable String checkId, @RequestBody CheckParams params){
        try {
            return checkService.update(checkId, params);
        }catch (Exception e){
            log.info("异常："+e);
            return Result.fail("请求服务器出现错误！", e.getMessage());
        }
    }

}
