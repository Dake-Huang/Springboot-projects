package com.bjpowernode.springboot.service.impl;

import com.bjpowernode.springboot.bean.Student;
import com.bjpowernode.springboot.mapper.StudentMapper;
import com.bjpowernode.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public Student queryStudent(Integer id) {
        Student student = studentMapper.selectByPrimaryKey(id);
        return student;
    }
    @Transactional
    @Override
    public Integer updateStudent(Student student) {
        int i = studentMapper.updateByPrimaryKeySelective(student);
//        int a = 10/0;
        return i;
    }

}
