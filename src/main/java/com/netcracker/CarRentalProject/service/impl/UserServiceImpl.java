package com.netcracker.CarRentalProject.service.impl;
import com.netcracker.CarRentalProject.Controller.bean.Cars;
import com.netcracker.CarRentalProject.Controller.bean.User;
import com.netcracker.CarRentalProject.dao.UserDao;
import com.netcracker.CarRentalProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;
import java.sql.Time;
import java.time.LocalTime;
import java.util.List;

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

    @Override
    public List<Cars> getDetails() {
        return userDao.getDetails();
    }

    @Override
    public List<Cars> getCarDetails(LocalTime from,LocalTime to, String model) {

        return userDao.getCarDetails(from,to,model);
    }

    @Override
    public Cars getCarId(Integer id) {
        return userDao.getCarId(id);
    }
    @Override
    public List<Cars> getAscSortList() {
        return userDao.getAscSortList();
    }
    @Override
    public List<Cars> getDscSortList() {
        return userDao.getDscSortList();
    }

    @Override
    public List<Cars> getModelSortList() {
        return userDao.getModelSortList();
    }

    @Override
    public List<Cars> getRegDetails(Integer regnum) {
        return userDao.getRegDetails(regnum);
    }


}
