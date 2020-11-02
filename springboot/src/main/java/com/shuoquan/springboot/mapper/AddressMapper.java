package com.shuoquan.springboot.mapper;

import com.shuoquan.springboot.entity.Address;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AddressMapper {
    @Select("select * from milk_server.address where id = #{id}")
    Address findOne(@Param("id") Integer id);

    @Select("select * from milk_server.address")
    List<Address> findAll();
}
