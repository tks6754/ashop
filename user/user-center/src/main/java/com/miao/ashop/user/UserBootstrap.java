package com.miao.ashop.user;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@MapperScan("com.miao.ashop.user.dao")
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class UserBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(UserBootstrap.class, args);
    }
}
