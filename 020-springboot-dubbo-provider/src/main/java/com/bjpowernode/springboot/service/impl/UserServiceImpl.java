package com.bjpowernode.springboot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.bjpowernode.dubbo.User;
import com.bjpowernode.service.UserService;
import org.springframework.stereotype.Component;

@Component
@Service(interfaceClass = UserService.class,version = "1.0.0",timeout = 15000)
public class UserServiceImpl implements UserService {
    @Override
    public User queryUserById(Integer id,String name) {
        User user = new User();
        user.setId(id);
        user.setName(name);
        return user;
    }

    @Override
    public int queryUserCount() {
        return 12;
    }
}
