package com.dr.mapper;

import com.dr.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper    // 在运行时，会自动生成该接口的实现类对象(代理对象)，并且将该对象讲给ioc容器管理
public interface UserMapper {

    @Select("select * from user")
    public List<User> lists();

    @Delete("delete from user where id = #{id}")
    public void delete(Integer id);
}
