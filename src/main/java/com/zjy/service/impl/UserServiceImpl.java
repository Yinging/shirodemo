package com.zjy.service.impl;

import com.zjy.dao.IUserDao;
import com.zjy.pojo.User;
import com.zjy.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by ZhaoJunYong on 2017/7/7.
 */
@SuppressWarnings("SpringJavaAutowiringInspection")
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public User getUserById(int userId) {
        // TODO Auto-generated method stub
        return this.userDao.selectByPrimaryKey(userId);
    }
}