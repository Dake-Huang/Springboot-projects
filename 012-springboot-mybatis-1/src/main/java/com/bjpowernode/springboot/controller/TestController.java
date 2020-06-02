package com.bjpowernode.springboot.controller;

import com.bjpowernode.springboot.bean.User;
import com.bjpowernode.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    //自动注入service层
    @Autowired
    private UserService userService;

    @RequestMapping("/query")
    public @ResponseBody User queryUser(Integer id) {
        User user = userService.queryUser(id);
        return user;
    }
}
