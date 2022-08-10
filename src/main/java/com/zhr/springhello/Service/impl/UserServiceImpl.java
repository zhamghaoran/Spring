package com.zhr.springhello.Service.impl;

import com.zhr.springhello.Service.UserService;
import com.zhr.springhello.dao.UserDao;
import org.springframework.cache.annotation.SpringCacheAnnotationParser;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void saveUser() {
        System.out.println("保存成功");
    }
}
