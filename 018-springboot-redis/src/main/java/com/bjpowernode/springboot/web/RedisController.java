package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {
    @Autowired
    private StudentService studentService;
    //存入Redis中
    @RequestMapping("/put")
    public Object put(String key,String value){
        studentService.put(key,value);
        return "Redis值存入成功";
    }
    //从Redis中取值
    @RequestMapping("/get")
    public Object get(){
        String count = studentService.get("count");
        return "redis中的count值为:"+count;
    }
}
