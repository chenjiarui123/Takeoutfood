package com.sky.controller.admin;

import com.sky.dto.SetmealDTO;
import com.sky.dto.SetmealPageQueryDTO;
import com.sky.result.PageResult;
import com.sky.result.Result;
import com.sky.service.SetmealService;
import com.sky.vo.SetmealVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/setmeal")
@Slf4j
@Api(tags = "套餐相关接口")
public class SetmealController {

    @Autowired
    private SetmealService setmealService;

    /**
     * 新增套餐
     * 
     * @param setmealDTO
     * @return
     */
    // TODO: 实现新增套餐接口

    /**
     * 套餐分页查询
     * 
     * @param setmealPageQueryDTO
     * @return
     */
    // TODO: 实现套餐分页查询接口

    /**
     * 根据id查询套餐
     * 
     * @param id
     * @return
     */
    // TODO: 实现根据id查询套餐接口

    /**
     * 修改套餐
     * 
     * @param setmealDTO
     * @return
     */
    // TODO: 实现修改套餐接口

    /**
     * 套餐起售、停售
     * 
     * @param status
     * @param id
     * @return
     */
    // TODO: 实现套餐起售停售接口

    /**
     * 套餐批量删除
     * 
     * @param ids
     * @return
     */
    // TODO: 实现套餐批量删除接口
}
