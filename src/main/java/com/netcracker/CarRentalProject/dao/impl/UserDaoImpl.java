package com.netcracker.CarRentalProject.dao.impl;

import com.netcracker.CarRentalProject.Controller.bean.Cars;
import com.netcracker.CarRentalProject.Controller.bean.User;
import com.netcracker.CarRentalProject.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import javax.sql.DataSource;
import javax.annotation.PostConstruct;
import java.sql.*;

import org.springframework.jdbc.core.JdbcTemplate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class UserDaoImpl extends JdbcDaoSupport implements UserDao {
    @Autowired
    DataSource dataSource;

    @PostConstruct
    private void initialize()
    {
        setDataSource(dataSource);
    }
    @Override
    public User getUserById(String username) {
        String sql="select user_pswd from user where user_id=?";

        return getJdbcTemplate().queryForObject(sql, new Object[]{username}, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                User user=new User();
                user.setUsername(username);
                user.setPassword(rs.getString(1));
                return user;
            }
        });
    }

    @Override
    public int createNewUser(User user) {
        String sql="insert into user (user_id,user_pswd) values('admin', 'root')";
        return getJdbcTemplate().update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
                PreparedStatement ps=con.prepareStatement(sql);
                ps.setString(1, user.getUsername());
                ps.setString(2,user.getUsername());
                return ps;
            }
        });
    }
    String s="yes";
    @Override
    public List<Cars> getCarDetails(LocalTime from,LocalTime to, String model) {

        String sql = "select * from welcome where fromtime<=? and totime>=?";
        List<Cars> customers = new ArrayList<>();
        List<Map<String, Object>> list = getJdbcTemplate().queryForList(sql, from, to);
        for (Map<String, Object> map : list) {
            Cars obj = new Cars();
            obj.setModel((String) map.get("model"));
            obj.setCost((Integer) map.get("cost"));
            obj.setId((Integer) map.get("id"));
            customers.add(obj);
        }

        return customers;
    }
    public Cars getCarId(Integer id)
        {
            String sql="select * from welcome where id=?";
            return getJdbcTemplate().queryForObject(sql, new Object[]{id}, new RowMapper<Cars>() {
                @Override
                public Cars mapRow(ResultSet rs, int rowNum) throws SQLException {
                    Cars car=new Cars();
                    car.setModel(rs.getString(3));
                    car.setCost(rs.getInt(4));
                    car.setId(id);
                    System.out.println(car);
                    return car;
                }
            });
        }

    @Override
    public List<Cars> getSortList()
    {
        String sql="select * from welcome order by cost";

        List<Cars> cars= new ArrayList<>();
        List<Map<String, Object>> list = getJdbcTemplate().queryForList(sql);
        for (Map<String, Object> map : list) {
            Cars obj = new Cars();
            obj.setModel((String) map.get("model"));
            obj.setCost((Integer) map.get("cost"));
            obj.setId((Integer) map.get("id"));
            cars.add(obj);
        }
        System.out.println(cars);
        return cars;
    }
}


