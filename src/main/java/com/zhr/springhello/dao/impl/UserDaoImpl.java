package com.zhr.springhello.dao.impl;

import com.zhr.springhello.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public void saveuser() {
        System.out.println("保存成功");
    }
}
