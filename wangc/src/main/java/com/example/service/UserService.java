package com.example.service;

import com.example.mapper.UserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public Object getAllUser() {
        return userMapper.getAllUser();
    }
}