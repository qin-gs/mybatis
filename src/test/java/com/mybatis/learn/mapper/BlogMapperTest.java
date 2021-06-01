package com.mybatis.learn.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class BlogMapperTest {

    @Resource
    private BlogMapper mapper;

    @Test
    public void selectUserByBlogId() {
        System.out.println(mapper.selectUserByBlogId("blog-1"));
    }
}