package com.bjpowernode.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class indexController {

    @Value("${student.name}")
    private String stuname;

    @Value("${student.id}")
    private String stuid;
    @RequestMapping("/test")
    public @ResponseBody String test(){
        return "say:hello "+stuname+"学号:"+stuid;
    }
}
