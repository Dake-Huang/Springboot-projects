package com.bjpowernode.springboot.controller;

import com.bjpowernode.springboot.bean.Student;
import com.bjpowernode.springboot.bean.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class testController {
    @Autowired
    private Student student;
    @Autowired
    private Teacher teacher;

    @RequestMapping("/say")
    public @ResponseBody String say(){
        return "学生名字:"+student.getName()+"-------"+"学生年龄："+student.getAge()+"老师名字:"+teacher.getName()+"-------"+"老师年龄："+teacher.getAge();
    }

}
