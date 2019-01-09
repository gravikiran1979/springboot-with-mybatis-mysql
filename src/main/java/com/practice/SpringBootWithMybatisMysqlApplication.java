package com.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:spring/applicationContext.xml")
public class SpringBootWithMybatisMysqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWithMybatisMysqlApplication.class, args);
    }

}
