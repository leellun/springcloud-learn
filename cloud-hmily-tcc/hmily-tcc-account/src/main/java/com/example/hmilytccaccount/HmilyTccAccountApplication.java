package com.example.hmilytccaccount;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
@EnableDiscoveryClient
@EnableFeignClients
@EnableAspectJAutoProxy
@ImportResource({"classpath:applicationContext.xml"})
@EnableTransactionManagement
public class HmilyTccAccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(HmilyTccAccountApplication.class, args);
    }

}
