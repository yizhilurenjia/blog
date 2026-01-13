package org.example.blogbehind.service;

import org.example.blogbehind.enity.Guanzhu;
import org.example.blogbehind.enity.ResponseMessage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface guanzhuService
{
    //关注用户
    ResponseMessage Addguanzhu(Guanzhu guanzhu);

    //取消关注
    ResponseMessage delete_guanzhu(String username, String guanzhu_username);

    //查看关注的用户
    List<Guanzhu> guanzhu_list(String username);
}
