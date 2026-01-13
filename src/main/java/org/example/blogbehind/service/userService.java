package org.example.blogbehind.service;

import org.example.blogbehind.enity.ResponseMessage;
import org.example.blogbehind.enity.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ResourceBundle;

@Service
public interface userService
{
    //注册
    ResponseMessage registetr(String username, String password,String email,String image);

    //登录
    ResponseMessage login(String username, String password);

    //修改密码
    ResponseMessage updatePassword(String username, String password);

    //修改头像
    ResponseMessage updateImage(String username, String image);

    //修改简介
    ResponseMessage updateJianjie(String username, String jianjie);

    //修改邮箱
    ResponseMessage updateEmail(String username, String email);

    //查询用户
    List<User> searchuser(String username);
}
