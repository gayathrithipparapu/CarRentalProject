package com.netcracker.CarRentalProject.service.impl;

import com.netcracker.CarRentalProject.Controller.bean.User;
import com.netcracker.CarRentalProject.dao.UserDao;
import com.netcracker.CarRentalProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;
    @Override
    public User getUserByUserId(String username) {
        User user=userDao.getUserById(username);
        return user;
    }

    @Override
    public int createNewUser(User user) {
        return userDao.createNewUser(user);
    }
}