package com.example.springreactive.repository;

import com.example.springreactive.entity.Customer;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ReactiveCustomerRepository extends ReactiveCrudRepository<Customer, Long> {
}
