package com.streamforge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.streamforge.mapper")
public class StreamforgeApplication {
    public static void main(String[] args) {
        SpringApplication.run(StreamforgeApplication.class, args);
    }
}
