package com.netcracker.CarRentalProject.service;

import com.netcracker.CarRentalProject.Controller.bean.Cars;
import com.netcracker.CarRentalProject.Controller.bean.User;

import java.sql.Time;
import java.time.LocalTime;
import java.util.List;

public interface UserService {
    User getUserByUserId(String username);
    int createNewUser(User user);
    List<Cars> getCarDetails(String from, String to, String model);

}
