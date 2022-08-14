package com.newland.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class CloudZkProviderOrder8004Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudZkProviderOrder8004Application.class, args);
    }
    @RequestMapping("/helloZk")
    public String helloZk() {
        return "nice to meet you";
    }
}
