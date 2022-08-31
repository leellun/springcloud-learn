package com.example.school.client;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: leell
 * Date: 2022/8/31 20:26:22
 */
@Component
public class CourseClientImpl implements CourseClient {
    @Override
    public Object book() {
        Map<String, Object> map = new HashMap<>();
        map.put("msg", "失败了");
        return map;
    }
}
