package com.bjpowernode.springboot.controller;

import com.bjpowernode.springboot.bean.Student;
import com.bjpowernode.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @Autowired
    private StudentService studentService;
    @RequestMapping("/query")
    public @ResponseBody Student queryStudent(Integer id){
        Student student = studentService.queryStudentById(id);
        return student;
    }
    @RequestMapping("/insert")
    public @ResponseBody Integer addStudent(Student student){
        int num = studentService.addStudentById(student);
        return num;
    }
}
