package com.newland.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class CloudConsulProvider8006Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsulProvider8006Application.class, args);
    }

    @RequestMapping("/hello")
    public String hello() {
        return "nice to meet you";
    }
}
