package org.example.blogbehind.service;

import org.example.blogbehind.enity.Article;
import org.example.blogbehind.enity.Like;
import org.example.blogbehind.enity.ResponseMessage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface likeService
{
    //添加收藏
    ResponseMessage Addlike(Like like);

    //查询收藏
    List<Article> Searchlike(String username);

    //取消收藏
    ResponseMessage Deletelike(Like like);
}
