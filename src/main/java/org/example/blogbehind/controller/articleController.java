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
    {
        return articleService.Updatearticle(article);
    }

    @RequestMapping()
    ResponseMessage Deletearticle(int id)
    {
        return articleService.Deletearticle(id);
    }

    @RequestMapping()
    List<Article> Searcharticle(String title)
    {
        return articleService.Searcharticle(title);
    }

    @RequestMapping()
    List<Article> Searcharticlebycategory(String category_name)
    {
        return articleService.Searcharticlebycategory(category_name);
    }

    @RequestMapping()
    List<Article> Searcharticlebyusername(String create_user)
    {
        return articleService.Searcharticlebyusername(create_user);
    }
}
