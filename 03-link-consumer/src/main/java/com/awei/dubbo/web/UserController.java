package com.awei.dubbo.web;

import com.awei.dubbo.model.User;
import com.awei.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: Dubbo
 * @author: Awei
 * @create: 2021-01-29 11:49
 **/
@Controller
public class UserController {

    // 自动注入
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getUserDetail")
    public String userDetail(Model model, Integer id) {
        User user = userService.queryUserById(id);
        model.addAttribute("user", user);
        return "userDetail";

    }

    @RequestMapping(value = "/getCount")
    public @ResponseBody Object
    getCount() {
        return userService.userConut().toString();
    }
}
