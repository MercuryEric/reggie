package com.itheima.reggie.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.reggie.common.BaseContext;
import com.itheima.reggie.common.R;
import com.itheima.reggie.entity.OrderDetail;
import com.itheima.reggie.entity.Orders;
import com.itheima.reggie.entity.User;
import com.itheima.reggie.servcice.OrderDetailService;
import com.itheima.reggie.servcice.OrderService;
import com.itheima.reggie.servcice.UserService;
import com.itheima.reggie.utils.ValidateCodeUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private OrderDetailService orderDetailService;


    @PostMapping("/submit")
    public R<String> submit(@RequestBody Orders orders) {
        orderService.submit(orders);

        return R.success("成功支付");


    }


//查看订单详情，未完成
  /*  @GetMapping("/userPage")
    public R<Page<OrderDetail>> detail(Integer page, Integer pageSize) {
        Long userId = BaseContext.getCurrentId();

        LambdaQueryWrapper<Orders> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Orders::getUserId, userId);
        queryWrapper.orderByDesc(Orders::getOrderTime);
        List<Orders> list = orderService.list(queryWrapper);
        Orders orders = list.get(0);

        LambdaQueryWrapper<OrderDetail> orderDetailLambdaQueryWrapper = new LambdaQueryWrapper<>();
        Page<OrderDetail> pageInfo = new Page<>(page, pageSize);
        orderDetailLambdaQueryWrapper.eq(OrderDetail::getOrderId, orders.getId());
        Page<OrderDetail> orderDetailPage = orderDetailService.page(pageInfo, orderDetailLambdaQueryWrapper);
        return R.success(orderDetailPage);


    }*/


}
