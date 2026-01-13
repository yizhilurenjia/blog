package org.example.blogbehind.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.blogbehind.enity.Article;
import org.example.blogbehind.enity.Like;

import java.util.List;

@Mapper
public interface likeMapper
{
    //添加收藏
    @Insert("insert into like(username,article_id) values(#{username},#{article_id})")
    int Addlike(Like like);

    //查询收藏
    @Select("select * from article where id in (select article_id from like where username=#{username})")
    List<Article> Searchlike(String username);

    //取消收藏
    @Delete("delete from like where username= #{username} and article_id= #{article_id}")
    int Deletelike(Like like);
}
