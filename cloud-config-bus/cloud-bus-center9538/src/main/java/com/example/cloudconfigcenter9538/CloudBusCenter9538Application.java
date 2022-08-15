package com.example.cloudconfigcenter9538;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CloudBusCenter9538Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudBusCenter9538Application.class, args);
    }

}
