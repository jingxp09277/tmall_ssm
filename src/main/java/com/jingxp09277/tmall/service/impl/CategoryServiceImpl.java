package com.jingxp09277.tmall.service.impl;

import com.jingxp09277.tmall.mapper.CategoryMapper;
import com.jingxp09277.tmall.pojo.Category;
import com.jingxp09277.tmall.pojo.CategoryExample;
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
    public List<Category> list() {
        CategoryExample example = new CategoryExample();
        example.setOrderByClause("id desc");
        return categoryMapper.selectByExample(example);
    }

    @Override
    public void add(Category category) {
        categoryMapper.insert(category);
    }

    @Override
    public void delete(int id) {
        categoryMapper.deleteByPrimaryKey(id);
    }
    @Override
    public Category get(int id) {
        return categoryMapper.selectByPrimaryKey(id);
    }
    @Override
    public void update(Category category) {
        categoryMapper.updateByPrimaryKeySelective(category);
    }
}
