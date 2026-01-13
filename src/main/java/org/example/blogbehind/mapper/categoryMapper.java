package org.example.blogbehind.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.blogbehind.enity.Category;

import java.util.List;

@Mapper
public interface categoryMapper
{
    //查询所有类别
    @Select("select * from category")
    List<Category> Allcategory();


}
