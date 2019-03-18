package com.jingxp09277.tmall.service;

import com.jingxp09277.tmall.pojo.Property;

import java.util.List;

public interface PropertyService {
    List list(int cid);
    void add(Property property);
    void delete(int id);
    Property get(int id);
    void update(Property property);
}
