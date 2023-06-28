package com.itheima.reggie.servcice.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.reggie.entity.ShoppingCart;
import com.itheima.reggie.entity.User;
import com.itheima.reggie.mapper.ShoppingCartMapper;
import com.itheima.reggie.mapper.UserMapper;
import com.itheima.reggie.servcice.ShoppingCartService;
import com.itheima.reggie.servcice.UserService;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {

}
