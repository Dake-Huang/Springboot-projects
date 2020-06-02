package com.bjpowernode.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {
    @RequestMapping("/say")
    @ResponseBody
    public String say(){
        return "say:Hello say()";
    }

    @RequestMapping("/mapsay")
    public @ResponseBody Map<String, Object> mapSay() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("message","Hello sayMap");
        return map;
    }
}
