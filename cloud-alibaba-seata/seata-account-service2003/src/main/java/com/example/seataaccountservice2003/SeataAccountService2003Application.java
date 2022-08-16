package com.example.seataaccountservice2003;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@SpringBootApplication(exclude =  DataSourceAutoConfiguration.class) //取消数据源的自动创建
public class SeataAccountService2003Application {

    public static void main(String[] args) {
        SpringApplication.run(SeataAccountService2003Application.class, args);
    }

}
