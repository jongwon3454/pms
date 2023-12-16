package com.choi.publicScheduleMange.service.impl;

import com.choi.publicScheduleMange.mapper.UserMapper;
import com.choi.publicScheduleMange.model.UserMgt;
import com.choi.publicScheduleMange.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public void register(UserMgt user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userMapper.register(user);
    }
/*
    @Override
    public UserDetail getLoginUserByLoginId(String name) {
        return userMapper.loginUserByLoginId(name);
    }*/
}
