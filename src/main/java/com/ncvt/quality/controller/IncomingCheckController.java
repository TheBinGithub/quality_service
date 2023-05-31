package com.ncvt.quality.controller;

import com.ncvt.quality.params.IncomingCheckParams;
import com.ncvt.quality.params.QueryIncomingCheckParams;
import com.ncvt.quality.service.IncomingCheckService;
import com.ncvt.quality.service.PickingListService;
import com.ncvt.quality.util.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Api(tags = "来料检验模块")
@RestController
@Slf4j
public class IncomingCheckController {

    @Resource
    private PickingListService pickingListService;

    @Resource
    private IncomingCheckService incomingCheckService;

    @ApiOperation("查询领料单数据")
    @GetMapping("/pglt")
    public Object queryPglt(){
        try {
            return pickingListService.query();
        }catch (Exception e){
            log.info("异常："+e);
            return Result.fail("请求服务器出现错误！", e.getMessage());
        }
    }

    @ApiOperation("查询防错数据")
    @PostMapping("/igck/{page}")
    public Object queryIgck(@PathVariable Integer page, @RequestBody QueryIncomingCheckParams params){
        try {
            return incomingCheckService.query(page, params);
        }catch (Exception e){
            log.info("异常："+e);
            return Result.fail("请求服务器出现错误！", e.getMessage());
        }
    }

    @ApiOperation("添加防错数据")
    @PostMapping("/igck")
    public Object addIgck(@RequestBody IncomingCheckParams params){
        try {
            return incomingCheckService.add(params);
        }catch (Exception e){
            log.info("异常："+e);
            return Result.fail("请求服务器出现错误！", e.getMessage());
        }
    }

    @ApiOperation("删除防错数据")
    @DeleteMapping("/igck/{igckId}")
    public Object deleteIgck(@PathVariable String igckId){
        try {
            return incomingCheckService.delete(igckId);
        }catch (Exception e){
            log.info("异常："+e);
            return Result.fail("请求服务器出现错误！", e.getMessage());
        }
    }

    @ApiOperation("修改防错数据")
    @PatchMapping("/igck/{igckId}")
    public Object updateIgck(@PathVariable String igckId, @RequestBody IncomingCheckParams params){
        try {
            return incomingCheckService.update(igckId, params);
        }catch (Exception e){
            log.info("异常："+e);
            return Result.fail("请求服务器出现错误！", e.getMessage());
        }
    }

}
