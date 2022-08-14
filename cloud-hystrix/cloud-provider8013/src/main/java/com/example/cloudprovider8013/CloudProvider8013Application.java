package com.example.cloudprovider8013;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class CloudProvider8013Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudProvider8013Application.class, args);
    }

    @RequestMapping("/hello")
    public String helloZk(@RequestParam("name") String name) {
        return "hello " + name;
    }
}
