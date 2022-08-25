package com.example.cloudalibabasentinelservice8401;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * java  -Dserver.port=8480 -Dcsp.sentinel.dashboard.server=localhost:8480  -Dproject.name=sentinel-dashboard -Dsentinel.dashboard.auth.username=sentinel -Dsentinel.dashboard.auth.password=123456 -jar sentinel-dashboard-1.8.2.jar
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudalibabaSentinelService8401Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudalibabaSentinelService8401Application.class, args);
    }

}
