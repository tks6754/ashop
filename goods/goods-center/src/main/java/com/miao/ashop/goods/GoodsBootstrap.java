package com.miao.ashop.goods;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.miao.ashop.goods.dao")
public class GoodsBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(GoodsBootstrap.class, args);
    }
}
