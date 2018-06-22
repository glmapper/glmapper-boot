package com.glmapper.book.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.glmapper.book.dao")
@ComponentScan(basePackages={"com.glmapper.book"})
public class GlmapperBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(GlmapperBootApplication.class, args);
    }
}
