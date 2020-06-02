package com.bjpowernode.springboot.service.impl;

import com.bjpowernode.springboot.bean.Student;
import com.bjpowernode.springboot.mapper.StudentMapper;
import com.bjpowernode.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl extends StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public Student queryStudent(Integer id) {
        Student student = studentMapper.selectByPrimaryKey(id);
        return student;
    }
}
