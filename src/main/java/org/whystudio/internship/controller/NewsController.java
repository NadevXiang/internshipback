package org.whystudio.internship.controller;

import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.whystudio.internship.vo.JsonResult;

/**
 *
 * 公告信息查询控制器
 *
 */
@Slf4j
@RestController
@RequestMapping("/news")
public class NewsController extends BaseController {

    @GetMapping("")
    @ApiOperation(value = "获取新闻列表", notes = "分页获取, page传页数, limit传限制条数, 若不传,返回数据库最新20条")
    @Deprecated
    public JsonResult newsList(Integer limit, Integer page){
        // 后台默认数值拒绝使用魔法值,使用常量定义, 养成好习惯
        return null;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "通过当前Id获取某条新闻", notes = "返回当前记录的前一条记录和后一条记录的Id,方便next prev")
    @Deprecated
    public JsonResult whichNews(@PathVariable Integer id){
        // 注意: 每次访问该条新闻时, 需要 read + 1 的功能, 不需要判断IP,访问即加1
        // 由于点赞、踩需要额外设置数据库,会使得数据库增加一个无用表, 暂时保留该功能.
        return null;
    }

}
