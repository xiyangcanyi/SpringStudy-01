package com.zyp.config;

import com.zyp.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.zyp.pojo")
@Import(ZypConfig2.class)
public class ZypConfig {
    //注册一个bean，就相当于我们之前学的一个bean标签
    //这个方法的名字，就相当于bean标签的id属性
    //这个方法的返回值，就相当于bean标签的class属性
    @Bean
    public User getUser(){
        return new User();//返回要注入的对象
    }
}
