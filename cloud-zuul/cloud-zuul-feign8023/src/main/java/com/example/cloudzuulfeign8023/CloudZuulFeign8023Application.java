package com.example.cloudzuulfeign8023;

import com.example.cloudzuulfeign8023.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableFeignClients
@EnableHystrix
@RestController
public class CloudZuulFeign8023Application {
    @Autowired
    private SchedualServiceHi schedualServiceHi;

    @RequestMapping("/hello")
    public String helloZk() {
        return schedualServiceHi.sayHiFromClientOne("path2");
    }

    public static void main(String[] args) {
        SpringApplication.run(CloudZuulFeign8023Application.class, args);
    }

}
