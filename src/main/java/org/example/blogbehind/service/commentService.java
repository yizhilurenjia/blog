package org.example.blogbehind.service;

import org.example.blogbehind.enity.Comment;
import org.example.blogbehind.enity.ResponseMessage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface commentService
{
    //添加评论
    ResponseMessage Addcomment(Comment comment);
    //显示评论
    List<Comment> Showcomment(int article_id);
    //删除评论
    ResponseMessage Deletecomment(int id);
}
