package com.example.datajpa.repository;

import com.example.datajpa.entity.Customer;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
