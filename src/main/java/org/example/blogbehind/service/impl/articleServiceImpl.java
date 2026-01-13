package org.example.blogbehind.service.impl;

import org.example.blogbehind.enity.Article;
import org.example.blogbehind.enity.ResponseMessage;
import org.example.blogbehind.mapper.articleMapper;
import org.example.blogbehind.service.articleService;
import org.example.blogbehind.utils.ThreadLocalUtil;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class articleServiceImpl implements articleService
{
    @Autowired
    private articleMapper articlemapper;

    @Override
    public List<Article> Allarticle()
    {
        List<Article>l=articlemapper.Allarticle();
        for(int i=0;i< l.size();i++)
        {
            for(int  j=0;j<l.size()-1;j++)
            {
                if(l.get(j).getGoodnum()< l.get(j+1).getGoodnum())
                {
                     Article temp=l.get(j);
                     l.set(j,l.get(j+1));
                     l.set(j+1,temp);
                }
                else if(l.get(j).getGoodnum()== l.get(j+1).getGoodnum())
                {
                    if( l.get(j).getViews()> l.get(j+1).getViews())
                    {
                         Article temp=l.get(j);
                         l.set(j,l.get(j+1));
                         l.set(j+1,temp);
                    }
                }
            }
        }
        return l;
    }

    @Override
    public ResponseMessage Addarticle(Article article)
    {
        Map<String,Object> map= ThreadLocalUtil.get();
        String username=(String)map.get("username");
        article.setCreate_user(username);
        articlemapper.Addarticle(article);
        return  ResponseMessage.success();
    }

    @Override
    public ResponseMessage Addarticle_category(int article_id,String category_name)
    {
        return null;
    }

    @Override
    public ResponseMessage Updatearticle(Article article)
    {
        Map<String,Object> map= ThreadLocalUtil.get();
        String username=(String)map.get("username");
        article.setCreate_user(username);
        articlemapper.Addarticle(article);
        return  ResponseMessage.success();
    }

    @Override
    public ResponseMessage Deletearticle(int id)
    {
        articlemapper.Deletearticle(id);
        return ResponseMessage.success();
    }

    @Override
    public List<Article> Searcharticle(String title)
    {
        return articlemapper.Searcharticle(title);
    }

    @Override
    public List<Article> Searcharticlebycategory(String category_name)
    {
        return List.of();
    }

    @Override
    public List<Article> Searcharticlebyusername(String create_user)
    {
        return articlemapper .Searcharticlebyusername(create_user);
    }
}
