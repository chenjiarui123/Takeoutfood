package com.sky.service;

import com.sky.dto.SetmealDTO;
import com.sky.dto.SetmealPageQueryDTO;
import com.sky.entity.Setmeal;
import com.sky.result.PageResult;
import com.sky.vo.DishItemVO;
import com.sky.vo.SetmealVO;

import java.util.List;

public interface SetmealService {

    // TODO: 定义新增套餐方法

    // TODO: 定义套餐分页查询方法

    // TODO: 定义根据id查询套餐方法

    // TODO: 定义修改套餐方法

    // TODO: 定义套餐起售停售方法

    // TODO: 定义套餐批量删除方法

    /**
     * 条件查询（用户端使用，不要删除）
     * 
     * @param setmeal
     * @return
     */
    List<Setmeal> list(Setmeal setmeal);

    /**
     * 根据id查询菜品选项（用户端使用，不要删除）
     * 
     * @param id
     * @return
     */
    List<DishItemVO> getDishItemById(Long id);
}
