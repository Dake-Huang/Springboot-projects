package com.bjpowernode.springboot.service;

import com.bjpowernode.springboot.bean.Student;

public abstract class StudentService {
    public abstract Student queryStudent(Integer id);
}
