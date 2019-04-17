package com.chq.springbootweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@EnableAutoConfiguration
@MapperScan(basePackages = "com.chq.springbootweb.mapper" )
@ComponentScan(basePackages = {"com.chq.springbootweb.aop","com.chq.springbootweb.controller","com.chq.springbootweb.service"})
public class SpringbootwebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootwebApplication.class, args);
    }

}
