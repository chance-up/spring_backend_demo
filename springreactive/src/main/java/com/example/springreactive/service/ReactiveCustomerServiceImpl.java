package com.example.springreactive.service;

import com.example.springreactive.entity.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ReactiveCustomerServiceImpl implements ReactiveCustomerService {

    @Autowired
    ReactiveCrudRepository<Customer, Long> repository;

    @Override
    public Mono<Customer> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Flux<Customer> findAll() {
        return repository.findAll();
    }

}
