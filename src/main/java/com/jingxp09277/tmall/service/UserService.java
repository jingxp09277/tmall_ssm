package com.jingxp09277.tmall.service;

import com.jingxp09277.tmall.pojo.User;

import java.util.List;

public interface UserService {
    void add(User c);
    void delete(int id);
    void update(User c);
    User get(int id);
    List list();
}
