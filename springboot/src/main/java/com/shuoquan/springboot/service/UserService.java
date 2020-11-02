package com.shuoquan.springboot.service;

import com.shuoquan.springboot.entity.User;
import com.shuoquan.springboot.entity.Users;

public interface UserService {
    Users getUser(Integer id);
}
