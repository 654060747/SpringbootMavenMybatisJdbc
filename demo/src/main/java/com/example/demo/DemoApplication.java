package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


//Spring Cloud 是构建 Spring Boot 分布式环境，也就是常说的云应用
//exclude={DataSourceAutoConfiguration.class}禁用数据库自动配置
//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
//@Configuration、@EnableAutoConfiguration、@ComponentScan == @SpringBootApplication
@SpringBootApplication
@MapperScan("com.example.demo.mapper")
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
