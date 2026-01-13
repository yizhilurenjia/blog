package org.example.blogbehind.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.blogbehind.enity.Article;

import java.util.List;

@Mapper
public interface recordMapper
{
    //查询历史记录
    @Select("select * from article where id in (select article_id from record where username=#{username})")
    List<Article> Allrecord(String username);

    //删除历史记录
    @Delete("delte from record where username=#{username} and article_id=#{article_id}")
    int DeleteRecord(String username, int article_id);

    //添加历史记录
    @Insert("insert into record(username,article_id,liulantime) values(#{username},#{article_id},NOW())")
    int Addrecord(String username, int article_id);
}
