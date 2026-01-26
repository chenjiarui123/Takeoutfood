package com.sky.mapper;

import com.github.pagehelper.Page;
import com.sky.annotation.AutoFill;
import com.sky.dto.SetmealPageQueryDTO;
import com.sky.entity.Setmeal;
import com.sky.enumeration.OperationType;
import com.sky.vo.DishItemVO;
import com.sky.vo.SetmealVO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface SetmealMapper {

    /**
     * 根据分类id查询套餐的数量（其他模块使用，不要删除）
     * 
     * @param id
     * @return
     */
    @Select("select * from setmeal where category_id=#{id}")
    Integer countByCategoryId(Long id);

    // TODO: 定义新增套餐方法

    // TODO: 定义套餐分页查询方法

    // TODO: 定义根据id查询套餐方法

    // TODO: 定义更新套餐方法

    // TODO: 定义根据id删除套餐方法

    /**
     * 动态条件查询套餐（用户端使用，不要删除）
     * 
     * @param setmeal
     * @return
     */
    List<Setmeal> list(Setmeal setmeal);

    /**
     * 根据套餐id查询菜品选项（用户端使用，不要删除）
     * 
     * @param setmealId
     * @return
     */
    @Select("select sd.name, sd.copies, d.image, d.description " +
            "from setmeal_dish sd left join dish d on sd.dish_id = d.id " +
            "where sd.setmeal_id = #{setmealId}")
    List<DishItemVO> getDishItemBySetmealId(Long setmealId);

    /**
     * 根据条件统计套餐数量（报表使用，不要删除）
     * 
     * @param map
     * @return
     */
    Integer countByMap(Map map);
}
