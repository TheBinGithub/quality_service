package com.ncvt.quality.controller;

import com.ncvt.quality.params.SamplingAddParams;
import com.ncvt.quality.params.SamplingQueryParams;
import com.ncvt.quality.service.CheckService;
import com.ncvt.quality.service.ProductionService;
import com.ncvt.quality.service.SamplingService;
import com.ncvt.quality.util.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Api(tags = "生产采样模块")
@RestController
@Slf4j
public class SamplingController {

    @Resource
    private CheckService checkService;

    @Resource
    private ProductionService productionService;

    @Resource
    private SamplingService samplingService;

    @ApiOperation("查询质检标准")
    @GetMapping("/qualitys/{page}/{pr}/{checkName}/{checkType}")
    public Object queryQualitys(@PathVariable Integer page,
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

    @ApiOperation("查询生产作业")
    @GetMapping("/production")
    public Object queryProduction(){
        try {
            return productionService.query();
        }catch (Exception e){
            log.info("异常："+e);
            return Result.fail("请求服务器出现错误！", e.getMessage());
        }
    }

    @ApiOperation("查询采样数据")
    @PostMapping("/samplings/{page}")
    public Object querySamp(@PathVariable Integer page ,@RequestBody SamplingQueryParams params){
        try {
            return samplingService.query(page, params);
        }catch (Exception e){
            log.info("异常："+e);
            return Result.fail("请求服务器出现错误！", e.getMessage());
        }
    }

    @ApiOperation("添加采样数据")
    @PostMapping("/sampling/{samplingId}")
    public Object addSamp(@PathVariable String samplingId, @RequestBody SamplingAddParams params){
        try {
            params.setSamplingId(samplingId);
            return samplingService.add(params);
        }catch (Exception e){
            log.info("异常："+e);
            return Result.fail("请求服务器出现错误！", e.getMessage());
        }
    }

    @ApiOperation("删除采样数据")
    @DeleteMapping("/sampling/{samplingId}")
    public Object deleteSamp(@PathVariable String samplingId){
        try {
            return samplingService.delete(samplingId);
        }catch (Exception e){
            log.info("异常："+e);
            return Result.fail("请求服务器出现错误！", e.getMessage());
        }
    }

    @ApiOperation("修改质检数据")
    @PatchMapping("/sampling/{samplingId}")
    public Object updateSamp(@PathVariable String samplingId, @RequestBody SamplingAddParams params){
        try {
            params.setSamplingId(samplingId);
            return samplingService.update(params);
        }catch (Exception e){
            log.info("异常："+e);
            return Result.fail("请求服务器出现错误！", e.getMessage());
        }
    }

}
