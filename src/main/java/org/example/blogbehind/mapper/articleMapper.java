package org.example.blogbehind.mapper;

import org.apache.ibatis.annotations.*;
import org.example.blogbehind.enity.Article;

import java.util.List;

@Mapper
public interface articleMapper
{
    // 查询所有文章
    @Select("select * from article")
    List<Article> Allarticle();

    // 添加文章
    @Insert("insert into article(title,content,image,create_user,like_num,goodnum,create_time,update_time,comment_num) " +
            "values(#{title},#{content},#{image},#{create_user},0,0,NOW(),NOW())")
    int Addarticle(Article article);

    //将文章和分类关联
    @Insert("insert into article_category(article_id,category_name) values(#{article_id},#{category_name})")
    int Addarticle_category(int article_id, String category_name);

    // 修改文章
    @Update("update article set title=#{title},content=#{content},image=#{image},category_name=#{category_name} where id=#{id}")
    int Updatearticle(Article article);

    // 删除文章
    @Delete("delete from article where id=#{id}")
    int Deletearticle(int id);

    // 按标题查询文章
    @Select("select * from article where title LIKE CONCAT('%', #{title}, '%')")
    List<Article> Searcharticle(String title);

    //按分类查询文章
    @Select("select * from article where id in (select article_id from article_category where category_name=#{category_name})")
    List<Article> Searcharticlebycategory(String category_name);

    //按用户查询文章
    @Select("select * from article where create_user= #{create_user}")
    List<Article> Searcharticlebyusername(String create_user);



}
