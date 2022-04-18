package com.example.demo.repository;

import com.example.demo.entity.User;

public interface HelloRepository {
    public User findUserById(Long id);

}
