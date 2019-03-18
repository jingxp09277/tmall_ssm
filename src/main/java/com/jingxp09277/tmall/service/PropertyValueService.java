package com.jingxp09277.tmall.service;

import com.jingxp09277.tmall.pojo.Product;
import com.jingxp09277.tmall.pojo.PropertyValue;

import java.util.List;

public interface PropertyValueService {
    void init(Product p);
    void update(PropertyValue pv);

    PropertyValue get(int ptid, int pid);
    List<PropertyValue> list(int pid);
}
