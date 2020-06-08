package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.entity.User;
import com.example.service.UserService;

@RestController //= @Controller +@ResponseBody  只能返回字符串和json
public class MVCController {

    @RequestMapping("/boot/rest")
    public Object getUser() {
        User user = new User();
        user.setName("王超");
        user.setAge(22);
        return user;
    }

    @Autowired
    private UserService userService;

    @RequestMapping("/boot/user")
    public Object getAllUser() {
        return userService.getAllUser();
    }
}
