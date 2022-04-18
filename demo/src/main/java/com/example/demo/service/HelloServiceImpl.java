package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.repository.HelloRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Autowired
    HelloRepository repository;

    @Override
    public User findUser(Long id) {
        System.out.println("this is Service!!");
        return repository.findUserById(id);
    }
}
