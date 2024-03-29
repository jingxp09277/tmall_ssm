package com.jingxp09277.tmall.service;

import com.jingxp09277.tmall.pojo.Category;
import com.jingxp09277.tmall.util.Page;

import java.util.List;

public interface CategoryService {
    List<Category> list();
    void add(Category category);
    void delete(int id);
    Category get(int id);
    void update(Category category);
}
