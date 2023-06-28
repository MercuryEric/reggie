package com.itheima.reggie.servcice.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.reggie.mapper.EmployeeMapper;
import com.itheima.reggie.entity.Employee;
import com.itheima.reggie.servcice.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

}
