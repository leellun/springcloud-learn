package com.example.hmilytccorder;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
@EnableFeignClients
@ImportResource({"classpath:applicationContext.xml"})
@MapperScan("com.example.hmilytccorder.mapper")
public class HmilyTccOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(HmilyTccOrderApplication.class, args);
    }

}
