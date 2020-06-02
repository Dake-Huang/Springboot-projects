package com.bjpowernode.springboot.service;

import com.bjpowernode.springboot.bean.Student;

public interface StudentService {
    Student queryStudentById(Integer id);
    Integer addStudentById(Student student);
}
