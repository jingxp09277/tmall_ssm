package com.jingxp09277.tmall.service.impl;

import com.jingxp09277.tmall.mapper.CategoryMapper;
import com.jingxp09277.tmall.pojo.Category;
import com.jingxp09277.tmall.service.CategoryService;
import com.jingxp09277.tmall.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryMapper categoryMapper;
    @Override
    public List<Category> list(Page page) {
        return categoryMapper.list(page);
    }
    @Override
    public int total() {
        return categoryMapper.total();
    }
}
