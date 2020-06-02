package com.bjpowernode.springboot.mapper;

import com.bjpowernode.springboot.bean.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface StudentMapper {

    @Select("select id,name.age from student where id =#{id}")
    Student selectByPrimaryKey(Integer studentId);

}