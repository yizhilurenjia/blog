package org.example.blogbehind.service;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.example.blogbehind.enity.Article;
import org.example.blogbehind.enity.ResponseMessage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface recordService
{
    //查询历史纪录
    List<Article> Allrecord(String username);

    //添加历史记录
    ResponseMessage Addrecord(String username, int article_id);

    //删除历史记录
    ResponseMessage DeleteRecord(String username, int article_id);
}
