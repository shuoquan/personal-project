package com.shuoquan.springboot.mapper;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shuoquan.springboot.SpringbootApplicationTests;
import com.shuoquan.springboot.entity.Address;
import com.shuoquan.springboot.entity.Users;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserMapperTest extends SpringbootApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private AddressMapper addressMapper;
    @Test
    void findOne() {
//        List<Users> userList = userMapper.findAll();
//        System.out.println("3333");
//        for(Users user : userList) {
//            System.out.println(user);
//        }

        // 分页操作
        PageHelper.startPage(2, 3);
        List<Address> addressList = addressMapper.findAll();
        PageInfo<Address> pageInfo = new PageInfo<>(addressList);
        for(Address address : pageInfo.getList()) {
            System.out.println(address);
        }
    }
}