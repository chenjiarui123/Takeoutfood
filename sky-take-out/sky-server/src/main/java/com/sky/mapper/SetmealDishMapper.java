package com.sky.mapper;

import com.sky.entity.SetmealDish;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SetmealDishMapper {

    /**
     * 根据菜品id查询对应的套餐id（菜品模块使用，不要删除）
     * 
     * @param dishIds
     * @return
     */
    List<Long> getSetmealIdsByDishIds(List<Long> dishIds);

    // TODO: 定义批量插入套餐菜品关系方法

    // TODO: 定义根据套餐id查询菜品方法

    // TODO: 定义根据套餐id删除套餐菜品关系方法
}
