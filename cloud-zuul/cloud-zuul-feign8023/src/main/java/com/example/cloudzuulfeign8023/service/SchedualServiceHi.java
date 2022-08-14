package com.example.cloudzuulfeign8023.service;

import com.example.cloudzuulfeign8023.service.impl.SchedualServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "CLOUD-ZUUL-PROVIDER",qualifier="schedualServiceHi",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
