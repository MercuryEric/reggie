package com.itheima.reggie.servcice.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.reggie.common.CustomException;
import com.itheima.reggie.entity.AddressBook;
import com.itheima.reggie.entity.Category;
import com.itheima.reggie.entity.Dish;
import com.itheima.reggie.entity.Setmeal;
import com.itheima.reggie.mapper.AddressBookMapper;
import com.itheima.reggie.mapper.CategoryMapper;
import com.itheima.reggie.servcice.AddressBookService;
import com.itheima.reggie.servcice.CategoryService;
import com.itheima.reggie.servcice.DishService;
import com.itheima.reggie.servcice.SetMealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {

}
