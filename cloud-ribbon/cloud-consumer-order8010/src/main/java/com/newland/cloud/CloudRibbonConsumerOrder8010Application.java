package com.newland.cloud;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
//在启动该微服务的时候就能去加载我们的自定义Ribbon配置类，从而使配置生效，
@RibbonClient(name ="cloud-zk-provider",configuration=MySelfRule.class)
public class CloudRibbonConsumerOrder8010Application {
    @Autowired
    private RestTemplate restTemplate;

    public static void main(String[] args) {
        SpringApplication.run(CloudRibbonConsumerOrder8010Application.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @RequestMapping("/helloribbonProvider")
    public String helloZk() {
        //instance name必须与上面一样，不能像Eureka那样可以大写(cloud-zk-provider)
        return restTemplate.getForObject("http://cloud-ribbon-provider/ribbonhello", String.class);
    }
}