package com.zyp.service;

import com.zyp.dao.UserDao;
import com.zyp.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
