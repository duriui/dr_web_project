package com.dr.service;

import com.dr.pojo.PageBean;
import org.springframework.stereotype.Service;

/**
 * @Author DR
 * @Date 2023/8/7
 * @Description
 */

@Service
public interface EmpService {
    PageBean page(Integer page, Integer pageSize);
}
