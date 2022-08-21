package com.newland.usercenter.controller;

import com.newland.common.UserService;
import com.newland.common.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userCenter")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/getUser")
    public User getUser(@RequestParam("username") String username){
        return userService.getUser(username);
    }
}
