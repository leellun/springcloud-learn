package com.example.school.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Author: leell
 * Date: 2022/8/31 20:24:17
 */
@Component
@FeignClient(value = "education-server", fallback = CourseClientImpl.class)
public interface CourseClient {
    @GetMapping("/course/book")
    public Object book();
}
