package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.bean.Student;
import com.bjpowernode.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
@RestController//类中的每个方法都返回json数据

public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/query")
    public Object queryStudent(Integer id){
        Student student = studentService.queryStudent(id);
        return student;
    }
    //GET主要是用于查询操作
    @GetMapping("/query1")
    public Object queryStudent1(Integer id){
        Student student = studentService.queryStudent(id);
        return student;
    }
    //POST主要用于添加操作
    @PostMapping("/insert")
    public Object addStudent(Student student){
        Integer num = studentService.addStudent(student);
        return num;
    }
    @DeleteMapping("/delete")
    public Object deleteStudentById(Integer id){
        Integer num = studentService.deleteStudent(id);
        return num;
    }
    @PutMapping("/update")
    public Object updateStudentById(){
        
        return "更新成功";
    }

}
