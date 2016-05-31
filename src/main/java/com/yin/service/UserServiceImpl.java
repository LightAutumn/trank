package com.yin.service;

import com.yin.dao.UserDao;
import com.yin.dao.UserDaoImpl;
import com.yin.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import java.util.List;

/**
 * Created by Administrator on 2016/5/15 0015.
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    private TransactionTemplate transactionTemplate;
    public TransactionTemplate getTransactionTemplate() {
        return transactionTemplate;
    }
    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }
    public void saveUser(final User user) {
      userDao.add(user);
    }

    public List<User> getUserList() {
        return userDao.getUserList();
    }

    public User getByName(String name) {
        return userDao.getByName(name);
    }
}
