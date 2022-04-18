package com.example.demo.controller;

import com.example.demo.PropertyTestConfig;
import com.example.demo.entity.User;
import com.example.demo.service.HelloService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @Autowired
    HelloService service;

    @Autowired
    PropertyTestConfig prop;

    @GetMapping("/user/{id}")
    public @ResponseBody User hello(@PathVariable("id") Long id) {
        System.out.println("this is Controller!!");
        // return User
        // .builder()
        // .id(id)
        // .name("KIM")
        // .build();

        return service.findUser(id);
    }

    @GetMapping("/property")
    public @ResponseBody PropertyTestConfig getProperty() {
        return prop;
    }

}
