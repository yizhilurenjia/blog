package org.example.blogbehind.service.impl;

import org.example.blogbehind.enity.Comment;
import org.example.blogbehind.enity.ResponseMessage;
import org.example.blogbehind.mapper.commentMapper;
import org.example.blogbehind.service.commentService;
import org.example.blogbehind.utils.ThreadLocalUtil;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class commentServiceImpl implements commentService
{
    @Autowired
    private commentMapper commentmapper;

    @Override
    public ResponseMessage Addcomment(Comment comment)
    {
        Map<String, Object> map = ThreadLocalUtil.get();
        String username = (String) map.get("username");
        comment.setUsername(username); // 必须设置 create_user
        commentmapper.Addcomment(comment);
        return ResponseMessage.success();
    }

    @Override
    public List<Comment> Showcomment(int article_id)
    {
        return commentmapper.Showcomment(article_id);
    }

    @Override
    public ResponseMessage Deletecomment(int id)
    {
        commentmapper.Deletecomment(id);
        return ResponseMessage.success();
    }
}
