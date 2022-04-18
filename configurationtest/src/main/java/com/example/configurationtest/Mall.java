package com.example.configurationtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mall {
    private User user;

    @Autowired
    public Mall(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}
