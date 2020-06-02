package com.bjpwernode.springboot.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.bjpowernode.dubbo.User;
import com.bjpowernode.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    //@Autowired
    @Reference(interfaceClass = UserService.class,version = "1.0.0",check = false)
    private UserService userService;

    @RequestMapping("/query")
    public @ResponseBody Object queryUserById(Integer id, String username){
        User user = userService.queryUserById(id, username);
        return user;
    }
    @RequestMapping("/count")
    public @ResponseBody Object queryUserCount(){
        int i = userService.queryUserCount();
        return i;
    }
}
