package com.example.springreactive.controller;

import com.example.springreactive.entity.Customer;
import com.example.springreactive.service.ReactiveCustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class ReactiveCustomerController {
    @Autowired
    ReactiveCustomerService service;

    @GetMapping("/customer/{id}")
    public Mono<Customer> findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @GetMapping("/customers")
    public Flux<Customer> fincAll() {
        return service.findAll();
    }
}
