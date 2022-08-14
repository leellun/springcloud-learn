package com.example.cloudhystrixdashboard8016;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class CloudHystrixDashboard8016Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudHystrixDashboard8016Application.class, args);
    }

}
