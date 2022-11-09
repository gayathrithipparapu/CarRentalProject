package com.netcracker.CarRentalProject.service;

import com.netcracker.CarRentalProject.Controller.bean.User;

public interface UserService {
    User getUserByUserId(String username);
    int createNewUser(User user);

}
