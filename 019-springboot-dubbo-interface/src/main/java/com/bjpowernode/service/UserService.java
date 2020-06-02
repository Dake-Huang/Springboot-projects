package com.bjpowernode.service;

import com.bjpowernode.dubbo.User;

public interface UserService {
    User queryUserById(Integer id,String username);
    int queryUserCount();

}
