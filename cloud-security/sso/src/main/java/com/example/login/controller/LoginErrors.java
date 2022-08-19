package com.example.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author: leell
 * Date: 2022/8/18 23:22:31
 */
@Controller
public class LoginErrors {

    @RequestMapping("/dashboard/login")
    public String dashboard() {
        return "redirect:/#/";
    }

}
