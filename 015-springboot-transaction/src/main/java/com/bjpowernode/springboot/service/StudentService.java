package com.bjpowernode.springboot.service;

import com.bjpowernode.springboot.bean.Student;

public interface StudentService {
    Student queryStudent(Integer id);

    Integer updateStudent(Student student);
}
