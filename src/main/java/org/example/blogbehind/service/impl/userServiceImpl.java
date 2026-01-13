package org.example.blogbehind.service.impl;

import org.example.blogbehind.enity.ResponseMessage;
import org.example.blogbehind.enity.User;
import org.example.blogbehind.mapper.userMapper;
import org.example.blogbehind.service.userService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class userServiceImpl implements userService
{
    @Autowired
    private userMapper usermapper;

    @Override
    public ResponseMessage registetr(String username,String password,String email,String image)
    {
        return ResponseMessage.success(usermapper.Regsiter(username,password,email,image));
    }

    @Override
    public ResponseMessage login(String username,String password)
    {

        return ResponseMessage.success(usermapper.Login(username,password));
    }

    @Override
    public ResponseMessage updatePassword(String username,String password)
    {
        return ResponseMessage.success(usermapper.UpdataPassword(username,password));
    }

    @Override
    public ResponseMessage updateImage(String username,String image)
    {
        usermapper.UpdataImage(username,image);
        return ResponseMessage.success();
    }

    @Override
    public ResponseMessage updateJianjie(String username,String jianjie)
    {
        usermapper.UpdataPassword(username,jianjie);
        return ResponseMessage.success();
    }

    @Override
    public ResponseMessage updateEmail(String username,String email)
    {
        usermapper.UpdataEmail(username,email);
        return ResponseMessage.success();
    }

    @Override
    public List<User> searchuser(String username)
    {
        return usermapper.Searchuser(username);
    }
}
