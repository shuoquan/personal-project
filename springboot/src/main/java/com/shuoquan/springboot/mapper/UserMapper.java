package com.shuoquan.springboot.mapper;
import com.shuoquan.springboot.entity.Users;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    List<Users> findAll();

    @Select("select * from milk_server.users where id = #{id}")
    Users findOne(@Param("id") Integer id);
}
