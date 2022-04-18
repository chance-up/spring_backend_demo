package com.example.rentaldemo.repository;

import com.example.rentaldemo.entity.Customer;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
