package com.itheima.reggie.servcice;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie.dto.DishDto;
import com.itheima.reggie.entity.Dish;
import com.itheima.reggie.entity.Employee;

public interface DishService extends IService<Dish> {
    public void saveWithFlavor(DishDto dishDto);


    public DishDto getByIdWithFlavor(Long id);

    void updateWithFlavor(DishDto dishDto);
}
