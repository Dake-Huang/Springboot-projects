package com.bjpowernode.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class indexController {
    @RequestMapping("/say")
    public ModelAndView say(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("message","hello modelAndView");
        mv.setViewName("WEB-INF/jsp/index");
        return mv;
    }
    @RequestMapping("/sayHello")
    public String sayHello(){
        return "HELLO";
    }
}
