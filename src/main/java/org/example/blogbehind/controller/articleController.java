package org.example.blogbehind.controller;

import org.example.blogbehind.enity.Article;
import org.example.blogbehind.enity.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.example.blogbehind.service.articleService;

import java.util.List;

@RestController
public class articleController
{
    @Autowired
    private articleService articleService;

    @RequestMapping()
    ResponseMessage Allarticle()
    {
        return ResponseMessage.success(articleService.Allarticle());
    }

    @RequestMapping()
    ResponseMessage Addarticle(@RequestBody Article article)
    {
        return articleService.Addarticle(article);
    }

    @RequestMapping()
    ResponseMessage Addarticle_category(int article_id, String category_name)
    {
        return articleService.Addarticle_category(article_id,category_name);
    }

    @RequestMapping()
    ResponseMessage Updatearticle(@RequestBody Article article)
    
}
