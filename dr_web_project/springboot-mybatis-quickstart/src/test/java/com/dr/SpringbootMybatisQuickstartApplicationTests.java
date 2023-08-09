package com.dr;

import com.dr.mapper.UserMapper;
import com.dr.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest //springboot整合单元测试的注解
class SpringbootMybatisQuickstartApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void TestUserlists(){
        List<User> userList = userMapper.lists();
        userList.stream().forEach( user -> {
            System.out.println(user);
        });
    }

    @Test
    public void TestDeleteUser(){
        userMapper.delete(1);
    }
}
