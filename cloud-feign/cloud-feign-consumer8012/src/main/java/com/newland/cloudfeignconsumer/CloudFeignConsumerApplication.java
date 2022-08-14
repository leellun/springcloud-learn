package com.newland.cloudfeignconsumer;

import com.newland.cloudfeignconsumer.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@RestController
public class CloudFeignConsumerApplication {
    @Autowired
    private SchedualServiceHi schedualServiceHi;

    @RequestMapping("/helloProvider")
    public String helloZk() {
        //instance name必须与上面一样，不能像Eureka那样可以大写(cloud-zk-provider)
        return schedualServiceHi.sayHiFromClientOne("sdfsdfsdfsdfsdfsdf");
    }

    public static void main(String[] args) {
        SpringApplication.run(CloudFeignConsumerApplication.class, args);
    }
}
