package com.zyw.doudou.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.zyw.doudou.user.mapper")
public class DoudouUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(DoudouUserApplication.class, args);
    }

}
