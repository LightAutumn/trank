package com.yin.dao;

import com.yin.entity.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2016/5/14 0014.
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    private SessionFactory sessionFactory;
    @Autowired
    public UserDaoImpl(SessionFactory sessionFactory) {//构造dao
        this.sessionFactory = sessionFactory;
    }
    private Session currentSession() {
        return sessionFactory.getCurrentSession();//从sessionFactory中获取当前session
    }

    public void add(User user) {
        currentSession().save(user);//使用当前session操作数据
    }
    public List<User> getUserList() {
        return currentSession().createQuery( "from User").list();
    }

    public User getByName(String name) {


      Query q=currentSession().createQuery("select user from User user where user.name='"+name+"'");
        User user=(User)q.uniqueResult();
        return user;
    }
}
