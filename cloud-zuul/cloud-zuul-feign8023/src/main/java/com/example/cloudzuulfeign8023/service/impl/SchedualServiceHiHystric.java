package com.example.cloudzuulfeign8023.service.impl;

import com.example.cloudzuulfeign8023.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * Author: leell
 * Date: 2022/8/14 20:40:33
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
