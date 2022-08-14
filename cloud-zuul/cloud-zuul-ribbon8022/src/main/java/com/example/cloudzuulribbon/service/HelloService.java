package com.example.cloudzuulribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Author: leell
 * Date: 2022/8/14 20:34:27
 */
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://CLOUD-ZUUL-PROVIDER/hello?name=" + name, String.class);
    }
    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }
}
