package com.example.cloudzuulribbon;

import com.example.cloudzuulribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableHystrix
@RestController
public class CloudZuulRibbon8022Application {
    @Autowired
    private HelloService helloService;
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @RequestMapping("/hello")
    public String helloZk() {
        return helloService.hiService("path1");
    }

    public static void main(String[] args) {
        SpringApplication.run(CloudZuulRibbon8022Application.class, args);
    }

}
