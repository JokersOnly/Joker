package com.apple.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

// test commit

@SpringBootApplication
/*(exclude = DataSourceAutoConfiguration.class)*/
@MapperScan(basePackages = "com.apple.springboot.index.mapper")
public class SpringbootApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }

}
