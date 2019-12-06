package com.miao.ashop.goods;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GoodsBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(GoodsBootstrap.class, args);
    }
}
