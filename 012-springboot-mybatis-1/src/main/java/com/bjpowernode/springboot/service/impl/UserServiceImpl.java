package com.bjpowernode.springboot.service.impl;

import com.bjpowernode.springboot.bean.User;
import com.bjpowernode.springboot.mapper.UserMapper;
import com.bjpowernode.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryUser(Integer id) {
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }
}
