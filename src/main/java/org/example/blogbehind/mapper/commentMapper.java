package org.example.blogbehind.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.blogbehind.enity.Comment;

import java.util.List;

@Mapper
public interface commentMapper
{
    //添加评论
    @Insert("insert into comment(username,content,create_time,article_id) values(#{username},#{content},NOW(),#{article_id})")
    int Addcomment(Comment comment);

    //显示评论
    @Select("select * from comment where article_id= #{article_id}")
    List<Comment> Showcomment(int article_id);

    //删除评论
    @Select("delete from comment where id=#{id}")
    int Deletecomment(int id);
}
