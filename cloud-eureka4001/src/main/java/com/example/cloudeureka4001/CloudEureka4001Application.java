package com.example.cloudeureka4001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CloudEureka4001Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudEureka4001Application.class, args);
    }

}
