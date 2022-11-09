package com.netcracker.CarRentalProject.dao;

import com.netcracker.CarRentalProject.Controller.bean.Cars;
import com.netcracker.CarRentalProject.Controller.bean.User;

import java.time.LocalTime;
import java.util.List;

public interface UserDao {
    User getUserById(String username);
    int createNewUser(User user);
    List cardetails(LocalTime from, LocalTime To, String model);


}