package com.newland.cloudtxrocketbank2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;

@SpringBootApplication
@MapperScan("com.newland.cloudtxrocketbank2.mapper")
@EnableBinding(Sink.class)
public class CloudTxRocketBank2Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudTxRocketBank2Application.class, args);
    }

}
