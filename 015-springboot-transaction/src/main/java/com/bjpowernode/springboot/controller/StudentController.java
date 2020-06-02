package com.bjpowernode.springboot.controller;

import com.bjpowernode.springboot.bean.Student;
import com.bjpowernode.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping("/query")
    public @ResponseBody Student queryStudent(Integer id){
        Student student = studentService.queryStudent(id);
        return student;
    }
    @RequestMapping("/update")
    public @ResponseBody Integer updateStudent(Integer id,String name){
        Student student = new Student();
        student.setStudentId(id);
        student.setStudentName(name);
        Integer num= studentService.updateStudent(student);
        return num;
    }
}
