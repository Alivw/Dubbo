package com.awei.dubbo.service.impl;

import com.awei.dubbo.model.User;
import com.awei.dubbo.service.UserService;

/**
 * @program: Dubbo
 * @author: Awei
 * @create: 2021-01-29 11:43
 **/
public class UserServiceImpl implements UserService {

    @Override
    public User queryUserById(Integer id) {
        // 模拟
        User user = new User();
        user.setId(id);
        user.setName("shizuwei");
        user.setAge(20);
        return user;
    }

    @Override
    public Integer userConut() {
        return 52;
    }
}
