package com.dr.service.impl;

import com.dr.mapper.DempMapper;
import com.dr.pojo.Dept;
import com.dr.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @Author DR
 * @Date 2023/8/7
 * @Description
 */

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DempMapper dempMapper;

    @Override
    public List<Dept> list() {
        return dempMapper.list();
    }


    @Override
    public void delete(Integer id) {
        dempMapper.deleteById(id);
    }

    @Override
    public void insert(Dept dept) {
        dept.setCreateTime(LocalDateTime.now());
        dept.setUpdateTime(LocalDateTime.now());
        dempMapper.insert(dept);
    }

    @Override
    public void update(Dept dept) {
        dept.setName("u");
    }
}
