package com.jingxp09277.tmall.service;

import com.jingxp09277.tmall.pojo.Category;
import com.jingxp09277.tmall.util.Page;

import java.util.List;

public interface CategoryService {
    int total();
    List<Category> list(Page page);
}
