package com.example.configurationtest;

import org.springframework.stereotype.Component;

@Component
public class User {
    private String name = "Hong";

    public String getName() {
        return name;
    }

}
