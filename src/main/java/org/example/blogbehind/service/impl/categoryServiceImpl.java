package org.example.blogbehind.service.impl;

import org.example.blogbehind.enity.Category;
import org.example.blogbehind.mapper.categoryMapper;
import org.example.blogbehind.service.categoryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class categoryServiceImpl implements categoryService
{
    @Autowired
    private categoryMapper categorymapper;

    @Override
    public List<Category> Allcategory()
    {
        return categorymapper.Allcategory();
    }
}
