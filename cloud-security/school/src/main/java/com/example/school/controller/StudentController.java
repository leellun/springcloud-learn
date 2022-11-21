package com.example.school.controller;

import com.example.school.client.CourseClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private CourseClient courseClient;

    /**
     * 老师权限或学生权限
     */
    @GetMapping("/grade")
    @PreAuthorize("hasAnyAuthority('teacher','student')")
    public Object rs(HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>();
        map.put("张三", 100);
        map.put("book", courseClient.book());
        return map;
    }


}
