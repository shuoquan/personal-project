package com.shuoquan.springboot.controller;

import com.shuoquan.springboot.entity.Address;
import com.shuoquan.springboot.entity.User;
import com.shuoquan.springboot.mapper.AddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private User user;
    @Autowired
    private AddressMapper addressMapper;

    @RequestMapping("/hello")
    public String hello() {
        System.out.println("abc");
        return "Hello Spring Boot!";
    }

//    @RequestMapping("/user")
//    public User user() {
//        System.out.println(0.1+0.2);
//        return user;
//    }
//
//    @RequestMapping("/address")
//    public Address address() {
//        Address address = addressMapper.findOne(1);
//        return address;
//    }
}