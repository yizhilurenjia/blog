package org.example.blogbehind.service;

import org.example.blogbehind.enity.Article;
import org.example.blogbehind.enity.ResponseMessage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface articleService
{
    // 查询所有文章
    List<Article> Allarticle();

    // 添加文章
    ResponseMessage Addarticle(Article article);

    // 将文章和分类关联
    ResponseMessage Addarticle_category(int article_id, String category_name);

    // 修改文章
    ResponseMessage Updatearticle(Article article);

    // 删除文章
    ResponseMessage Deletearticle(int id);

    // 按标题查询文章
    List<Article> Searcharticle(String title);

    // 按分类查询文章
    List<Article> Searcharticlebycategory(String category_name);

    // 按用户查询文章
    List<Article> Searcharticlebyusername(String create_user);


}
