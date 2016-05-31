package com.yin.dao;

import com.yin.entity.User;

import java.util.List;

/**
 * Created by Administrator on 2016/5/14 0014.
 */
public interface UserDao {
    void add(User user);
    List<User> getUserList();
    User getByName(String name);
}
