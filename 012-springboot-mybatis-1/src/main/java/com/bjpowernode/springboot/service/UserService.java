package com.bjpowernode.springboot.service;

import com.bjpowernode.springboot.bean.User;
import org.springframework.stereotype.Service;


public interface UserService {
    User queryUser(Integer id);
}
