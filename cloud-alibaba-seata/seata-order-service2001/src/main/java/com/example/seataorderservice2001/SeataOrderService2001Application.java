package com.example.seataorderservice2001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableFeignClients
@EnableDiscoveryClient
@EnableTransactionManagement
@SpringBootApplication(exclude =  DataSourceAutoConfiguration.class) //取消数据源的自动创建
public class SeataOrderService2001Application {

    public static void main(String[] args) {
        SpringApplication.run(SeataOrderService2001Application.class, args);
    }

}
