package com.example.hmilytccorder;

import org.dromara.hmily.spring.HmilyApplicationContextAware;
import org.dromara.hmily.spring.aop.SpringHmilyTransactionAspect;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
@EnableFeignClients
@EnableDiscoveryClient
@EnableAspectJAutoProxy
@ImportResource({"classpath:applicationContext.xml"})
@MapperScan("com.example.hmilytccorder.mapper")
public class HmilyTccOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(HmilyTccOrderApplication.class, args);
    }

}
