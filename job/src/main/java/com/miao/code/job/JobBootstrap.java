package com.miao.code.job;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.miao.code.job.dao")
@SpringBootApplication
public class JobBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(JobBootstrap.class, args);
    }

}
