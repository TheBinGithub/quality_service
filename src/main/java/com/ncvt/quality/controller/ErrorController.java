package com.ncvt.quality.controller;

import com.ncvt.quality.params.ErrorParams;
import com.ncvt.quality.service.ErrorService;
import com.ncvt.quality.util.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Api(tags = "防错管理模块")
@RestController
@Slf4j
public class ErrorController {

    @Resource
    private ErrorService errorService;

    @ApiOperation("查询防错数据")
    @GetMapping("/error/{page}")
    public Object queryError(@PathVariable Integer page){
        try {
            return errorService.queryAll(page);
        }catch (Exception e){
            log.info("异常："+e);
            return Result.fail("请求服务器出现错误！", e.getMessage());
        }
    }

    @ApiOperation("添加防错数据")
    @PostMapping("/error")
    public Object addError(@RequestBody ErrorParams params){
        try {
            return errorService.add(params);
        }catch (Exception e){
            log.info("异常："+e);
            return Result.fail("请求服务器出现错误！", e.getMessage());
        }
    }

    @ApiOperation("删除防错数据")
    @DeleteMapping("/error/{errorId}")
    public Object deleteError(@PathVariable String errorId){
        try {
            return errorService.delete(errorId);
        }catch (Exception e){
            log.info("异常："+e);
            return Result.fail("请求服务器出现错误！", e.getMessage());
        }
    }

    @ApiOperation("修改防错数据")
    @PatchMapping("/error/{errorId}")
    public Object updateQuality(@PathVariable String errorId, @RequestBody ErrorParams params){
        try {
            return errorService.update(errorId, params);
        }catch (Exception e){
            log.info("异常："+e);
            return Result.fail("请求服务器出现错误！", e.getMessage());
        }
    }

}
