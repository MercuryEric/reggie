package com.itheima.reggie.servcice;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie.entity.Orders;
import com.itheima.reggie.entity.User;

public interface OrderService extends IService<Orders> {
    public void submit(Orders orders);

}
