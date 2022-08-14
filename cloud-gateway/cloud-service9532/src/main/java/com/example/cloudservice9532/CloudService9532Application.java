package com.example.cloudservice9532;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class CloudService9532Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudService9532Application.class, args);
    }

    @RequestMapping("/gw2/hello")
    public String helloZk(@RequestParam("name") String name) {
        return "hello " + name;
    }
}
