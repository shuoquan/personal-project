package com.shuoquan.springboot.service.impl;

import com.shuoquan.springboot.entity.Users;
import com.shuoquan.springboot.mapper.UserMapper;
import com.shuoquan.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class UserServiceImpl implements UserService, Serializable {
    private UserMapper userMapper;
    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
    @Override
    public Users getUser(Integer id) {
        return userMapper.findOne(id);
    }
}
