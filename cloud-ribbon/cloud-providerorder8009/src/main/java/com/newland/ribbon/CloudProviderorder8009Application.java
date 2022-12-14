package com.newland.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class CloudProviderorder8009Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudProviderorder8009Application.class, args);
    }

    @RequestMapping("/ribbonhello")
    public String helloZk() {
        return "nice to meet you";
    }
}
