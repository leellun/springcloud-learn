package com.example.cloudhystrixribbon;

import com.example.cloudhystrixribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableHystrix
@RestController
public class CloudHystrixRibbonApplication {
    @Autowired
    private HelloService helloService;
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @RequestMapping("/helloProvider1")
    public String helloZk() {
        return helloService.hiService("test1");
    }

    public static void main(String[] args) {
        SpringApplication.run(CloudHystrixRibbonApplication.class, args);
    }

}
