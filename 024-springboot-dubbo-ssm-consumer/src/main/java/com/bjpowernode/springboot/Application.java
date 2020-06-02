package com.bjpowernode.springboot;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfig
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
