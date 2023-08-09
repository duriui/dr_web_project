package com.dr.mapper;

import com.dr.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author DR
 * @Date 2023/8/7
 * @Description
 */

@Mapper
public interface EmpMapper {

    @Select("select count(*) from emp")
    public Long count();

    @Select("select * from emp limit #{start},#{pageSize}")
    public List<Emp> page(Integer start,Integer pageSize);
}
