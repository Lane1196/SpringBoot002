package com.service;

import com.dao.UserDao;
import com.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Wzj on 2017/8/20 0020.
 */

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public void save(User user) {
        userDao.save(user);
    }

    public User update(User user) {
        return userDao.update(user);
    }

    public void removeById(Long id) {
        userDao.removeById(id);
    }

    public User getById(Long id) {
        return userDao.getById(id);
    }

    public List<User> findAll() {
        return userDao.findAll();
    }

}
