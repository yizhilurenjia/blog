package org.example.blogbehind.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.blogbehind.enity.Guanzhu;

import java.util.List;

@Mapper
public interface guanzhuMapper
{
    //关注用户
    @Insert("insert into guanzhu(username,usersname) values(#{username},#{guanzhu_username})")
    int Addguanzhu(Guanzhu guanzhu);

    //查看关注的用户
    @Select("select * from guanzhu where username=#{username}")
    List<Guanzhu> guanzhu_list(String username);

    //取关
    @Select("delete from guanzhu where username=#{username} and usersname=#{guanzhu_username}")
    int delete_guanzhu(String username, String guanzhu_username);
}
