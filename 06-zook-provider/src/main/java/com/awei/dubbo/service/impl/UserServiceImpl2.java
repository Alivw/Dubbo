package com.awei.dubbo.service.impl;

import com.awei.dubbo.model.User;
import com.awei.dubbo.service.UserService;

/**
 * @program: Dubbo
 * @author: Awei
 * @create: 2021-01-31 10:10
 **/
public class UserServiceImpl2 implements UserService {
    @Override
    public User queryUserById(Integer id, String name) {
        User user = new User();
        user.setId(id);
        user.setName(name+"---2");
        user.setAge(20);
        return user;
    }
}
