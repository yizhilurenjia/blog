package org.example.blogbehind.service.impl;

import org.example.blogbehind.enity.Article;
import org.example.blogbehind.enity.Like;
import org.example.blogbehind.enity.ResponseMessage;
import org.example.blogbehind.service.likeService;
import org.example.blogbehind.utils.ThreadLocalUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.example.blogbehind.mapper.likeMapper;

import java.util.List;
import java.util.Map;

public class likeServiceImpl implements likeService
{
    @Autowired
    private likeMapper likemapper;

    @Override
    public ResponseMessage Addlike(Like like)
    {
        Map<String, Object> map = ThreadLocalUtil.get();
        String username = (String) map.get("username");
        like.setUsername(username); // 必须设置 create_user
        likemapper.Addlike(like);
        return ResponseMessage.success();
    }

    @Override
    public List<Article> Searchlike(String username)
    {
        return likemapper.Searchlike(username);
    }

    @Override
    public ResponseMessage Deletelike(Like like)
    {
        Map<String, Object> map = ThreadLocalUtil.get();
        String username = (String) map.get("username");
        like.setUsername(username);
        likemapper.Deletelike(like);
        return ResponseMessage.success();
    }
}
