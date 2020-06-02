package com.bjpowernode.springboot.service.impl;

import com.bjpowernode.springboot.bean.Student;
import com.bjpowernode.springboot.mapper.StudentMapper;
import com.bjpowernode.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public Student queryStudentById(Integer id) {
        Student student = studentMapper.selectByPrimaryKey(id);
        return student;
    }

    @Override
    public Integer addStudentById(Student student) {
        int i = studentMapper.insert(student);
        return i;
    }
}
