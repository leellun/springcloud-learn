package com.newland.cloudtxrocketmqbank1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.newland.cloudtxrocketmqbank1.mapper")
public class CloudTxRocketmqBank1Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudTxRocketmqBank1Application.class, args);
    }

}
