package com.miao.ashop.user;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.miao.ashop.user.dao")
@SpringBootApplication
public class UserBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(UserBootstrap.class, args);
    }
}
