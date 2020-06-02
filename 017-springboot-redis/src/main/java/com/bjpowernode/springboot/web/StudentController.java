package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.bean.Student;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @RequestMapping("/query")
    public Object queryStudent(){
        return "查询成功";
    }
    @GetMapping("/query")
    public Object queryStudent1(Integer id){
        Student student = new Student();
        student.setStudentName("zhangasn");
        student.setStudentAge(25);
        return student;
    }
    @PostMapping("/query//detail/{id}/{name}")
    public Object queryStudent2(@PathVariable("id") Integer id,@PathVariable("name") String name){
        Student student = new Student();
        student.setStudentId(id);
        student.setStudentName(name);
        student.setStudentAge(23);
        return student;
    }

}
