package com.shuoquan.springboot.config;

import com.shuoquan.springboot.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration   // 代表当前类是一个配置类
public class UserConfig {
    @Bean      // 构建一个实例，放到spring容器中
    public User user() {
        User user = new User();
        user.setId(1);
        user.setName("李四");
        return user;
    }
}

// 4:50