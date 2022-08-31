package com.example.education.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: leell
 * Date: 2022/8/31 20:04:49
 */
@RestController
@RequestMapping("/course")
public class CourseController {


    /**
     * 老师权限或学生权限
     */
    @GetMapping("/book")
//    @PreAuthorize("hasAnyAuthority('teacher','student')")
    public Object book() {
        Map<String, Object> map = new HashMap<>();
        map.put("book", "语文 数学 英语");
        return map;
    }


}

