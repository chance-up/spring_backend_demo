package com.example.demo.repository;

import com.example.demo.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/*
Component
Controller, Service, Repository, Configuration
*/
@Repository
public class HelloRepositoryImpl implements HelloRepository {

    // Map<Long, User> users = new HashMap<>();

    // {
    // users.put(1L, new User(1L, "Hong"));
    // users.put(2L, new User(2L, "KIM"));
    // users.put(3L, new User(3L, "PARK"));
    // }
    @Autowired
    JdbcTemplate template;

    @Override
    public User findUserById(Long id) {
        String sql = "SELECT NAME FROM USER WHERE ID=?";
        User user = template.queryForObject(sql, (rs, rowNum) -> {
            return new User(rs.getLong(1), rs.getString(2));
        });

        return user;
    }
}
