package com.awei.dubbo.web;

import com.awei.dubbo.model.User;
import com.awei.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: Dubbo
 * @author: Awei
 * @create: 2021-01-29 13:36
 **/

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private UserService userService2;
    @RequestMapping(value = "/getUser")
    public String getUser(Model model, Integer id, String name) {
        User user = userService.queryUserById(id, name);
        User user2 = userService2.queryUserById(id, name);
        model.addAttribute("user", user);
        model.addAttribute("user2", user2);
        return "userDetail";
    }
}
