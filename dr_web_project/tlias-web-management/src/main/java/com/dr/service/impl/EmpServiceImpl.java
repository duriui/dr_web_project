package com.dr.service.impl;

import com.dr.mapper.EmpMapper;
import com.dr.pojo.Emp;
import com.dr.pojo.PageBean;
import com.dr.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author DR
 * @Date 2023/8/7
 * @Description
 */

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    @Override
    public PageBean page(Integer page, Integer pageSize) {
        // 1、获取总记录数
        Long count = empMapper.count();
        // 2、获取分页查询结果列表
        int start = (page - 1) * pageSize;
        List<Emp> empList = empMapper.page(start, pageSize);
        // 3、封装PageBean对象
        PageBean pageBean = new PageBean(count, empList);
        return pageBean;
    }
}
