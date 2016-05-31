package com.yin.service;

import com.yin.entity.User;

import java.util.List;

/**
 * Created by Administrator on 2016/5/15 0015.
 */
public interface UserService {
    void saveUser(User user);
    List<User> getUserList();
    User getByName(String name);
}
