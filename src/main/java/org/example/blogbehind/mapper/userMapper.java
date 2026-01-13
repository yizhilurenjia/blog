package org.example.blogbehind.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.example.blogbehind.enity.User;

import java.util.List;

@Mapper
public interface userMapper
{
    // 查询所有用户
    @Select("select * from user")
    List<User> Alluser();

    // 注册
    @Insert("insert into user(username,password,email,image) values(#{username},#{password},#{email},#{image})")
    int Regsiter(String username, String password,String email,String image);

    // 登录
    @Select("select * from user where username=#{username} and password=#{password}")
    int Login(String username, String password);

    // 修改密码
    @Update("update user set password=#{password} where username=#{username}")
    int UpdataPassword(String username, String password);

    // 修改头像
    @Update("update user set image= #{image} where username= #{username}")
    int UpdataImage(String username, String image);

    // 修改简介
    @Update("update user set jianjie=#{jianjie} where username=#{username}")
    int UpdataJianjie(String username, String jianjie);

    //修改邮箱
    @Update("update user set email= #{email} where username= #{username}")
    int UpdataEmail(String username, String email);

    //查询用户
    @Select("select * from user where username LIKE CONCAT('%', #{username}, '%')")
    List<User> Searchuser(String username);
}
