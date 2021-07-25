package com.awei.dubbo.service;

import com.awei.dubbo.model.User;

/**
 * @program: Dubbo
 * @author: Awei
 * @create: 2021-01-29 11:41
 **/
public interface UserService {
    User queryUserById(Integer id);


    Integer userConut();

}
