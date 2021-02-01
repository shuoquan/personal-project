package com.shuoquan.springboot;

import com.shuoquan.springboot.entity.Box;
import com.shuoquan.springboot.mapper.BoxMapper;
import javax.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
public class SpringbootApplicationTests {

    @Resource
    private BoxMapper boxMapper;
    @Test
    void contextLoads() {
        System.out.println("hello world");
        Box box = boxMapper.selectById(1);
        System.out.println(box.toString());
    }

}
