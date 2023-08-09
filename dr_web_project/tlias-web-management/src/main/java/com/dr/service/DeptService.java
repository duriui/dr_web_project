package com.dr.service;

import com.dr.pojo.Dept;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author DR
 * @Date 2023/8/7
 * @Description
 */

@Service
public interface DeptService {
    List<Dept> list();

    void delete(Integer id);

    void insert(Dept dept);

    void update(Dept dept);
}
