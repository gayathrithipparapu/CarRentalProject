package com.netcracker.CarRentalProject.dao.impl;

import com.netcracker.CarRentalProject.Controller.bean.User;
import com.netcracker.CarRentalProject.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import javax.sql.DataSource;
import javax.annotation.PostConstruct;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalTime;
import java.util.List;

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
        String sql="insert into user (user_id,user_pswd) values('admin', hex(aes_encrypt('root', 'secret')))";
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

    @Override
    public List cardetails(LocalTime from, LocalTime To, String model) {
        return null;
    }
}
