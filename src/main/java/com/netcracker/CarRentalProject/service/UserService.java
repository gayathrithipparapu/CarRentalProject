package com.netcracker.CarRentalProject.service;
import com.netcracker.CarRentalProject.Controller.bean.Cars;
import com.netcracker.CarRentalProject.Controller.bean.User;
import java.sql.Time;
import java.time.LocalTime;
import java.util.List;

public interface UserService {
    User getUserByUserId(String username);
    int createNewUser(User user);
    List<Cars> getDetails();
    List<Cars> getCarDetails(LocalTime from, LocalTime to, String model);
    Cars getCarId(Integer id);
    List<Cars> getAscSortList();
    List<Cars> getDscSortList();
    List<Cars> getModelSortList();
    List<Cars> getRegDetails(Integer regnum);


}
