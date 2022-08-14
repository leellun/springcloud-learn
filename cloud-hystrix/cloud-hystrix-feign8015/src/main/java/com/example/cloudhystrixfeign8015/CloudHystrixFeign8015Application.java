package com.example.cloudhystrixfeign8015;

import com.example.cloudhystrixfeign8015.service.SchedualServiceHi;
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
public class CloudHystrixFeign8015Application {
    @Autowired
    private SchedualServiceHi schedualServiceHi;

    @RequestMapping("/helloProvider2")
    public String helloZk() {
        return schedualServiceHi.sayHiFromClientOne("test1");
    }

    public static void main(String[] args) {
        SpringApplication.run(CloudHystrixFeign8015Application.class, args);
    }

}
