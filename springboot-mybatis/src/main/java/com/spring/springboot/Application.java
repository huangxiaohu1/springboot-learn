package com.spring.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Title Application
 * @Author huangxiaohu
 * @Description //TODO 
 * @Date 19:55 2019/7/15
 **/
@SpringBootApplication
@MapperScan(value = "com.spring.springboot.dao")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
