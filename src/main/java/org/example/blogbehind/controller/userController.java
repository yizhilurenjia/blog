package org.example.blogbehind.controller;


import org.example.blogbehind.enity.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.example.blogbehind.service.userService;

@RestController
public class userController
{
    @Autowired
    private userService userService;

    @RequestMapping("/Login")
    ResponseMessage login(String username, String password)
    {
        return userService.login(username,password);
    }
}
