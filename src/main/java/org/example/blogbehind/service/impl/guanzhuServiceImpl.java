package org.example.blogbehind.service.impl;

import org.example.blogbehind.enity.Guanzhu;
import org.example.blogbehind.enity.ResponseMessage;
import org.example.blogbehind.mapper.guanzhuMapper;
import org.example.blogbehind.service.guanzhuService;
import org.example.blogbehind.utils.ThreadLocalUtil;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class guanzhuServiceImpl implements guanzhuService
{
    @Autowired
    private guanzhuMapper guanzhumapper;

    @Override
    public ResponseMessage Addguanzhu(Guanzhu guanzhu)
    {
        Map<String, Object> map = ThreadLocalUtil.get();
        String username = (String) map.get("username");
        guanzhu.setUsername(username); // 必须设置 create_user
        guanzhumapper.Addguanzhu(guanzhu);
        return ResponseMessage.success();
    }

    @Override
    public ResponseMessage delete_guanzhu(String username,String guanzhu_username)
    {
        guanzhumapper.delete_guanzhu(username,guanzhu_username);
        return ResponseMessage.success();
    }

    @Override
    public List<Guanzhu> guanzhu_list(String username)
    {
        return guanzhumapper.guanzhu_list(username);
    }
}
