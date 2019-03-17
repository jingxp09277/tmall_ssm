package com.jingxp09277.tmall.mapper;

import com.jingxp09277.tmall.pojo.Category;
import com.jingxp09277.tmall.util.Page;

import java.util.List;

public interface CategoryMapper {
    List<Category> list(Page page);
    public int total();
}
