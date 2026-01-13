package org.example.blogbehind.service.impl;

import org.example.blogbehind.enity.Article;
import org.example.blogbehind.enity.ResponseMessage;
import org.example.blogbehind.mapper.recordMapper;
import org.example.blogbehind.service.recordService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class recordServiceImpl implements recordService
{
    @Autowired
    private recordMapper recordmapper;
    @Override
    public List<Article> Allrecord(String username)
    {
        return recordmapper.Allrecord(username);
    }

    @Override
    public ResponseMessage Addrecord(String username,int article_id)
    {
        recordmapper.Addrecord(username,article_id);
        return ResponseMessage.success();
    }

    @Override
    public ResponseMessage DeleteRecord(String username,int article_id)
    {
        recordmapper.DeleteRecord(username,article_id);
        return ResponseMessage.success();
    }
}
