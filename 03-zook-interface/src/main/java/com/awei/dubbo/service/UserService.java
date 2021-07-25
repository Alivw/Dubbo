package com.awei.dubbo.service;

import com.awei.dubbo.model.User;

/**
 * @program: Dubbo
 * @author: Awei
 * @create: 2021-01-29 13:08
 **/
public interface UserService {

    User queryUserById(Integer id,String name);


}

