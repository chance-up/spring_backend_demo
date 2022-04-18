package com.example.springreactive.service;

import com.example.springreactive.entity.Customer;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ReactiveCustomerService {
    Mono<Customer> findById(Long id);

    Flux<Customer> findAll();
}
