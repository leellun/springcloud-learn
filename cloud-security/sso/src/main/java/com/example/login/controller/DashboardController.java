package com.example.login.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;
import java.util.Collections;
import java.util.Map;

/**
 * Author: leell
 * Date: 2022/8/18 23:21:59
 */
@RequestMapping("/dashboard")
public class DashboardController {
    @RequestMapping("/message")
    public Map<String, Object> dashboard() {
        return Collections.<String, Object> singletonMap("message", "Yay!");
    }

    @RequestMapping("/user")
    public Principal user(Principal user) {
        return user;
    }

}
