package com.example.datajpa.service;

import java.util.ArrayList;

import com.example.datajpa.dto.CustomerDto;
import com.example.datajpa.entity.Customer;

public interface CustomerService {
    Customer insert(Customer customer);

    CustomerDto get(Long id);

    ArrayList<Customer> getList();

    CustomerDto create(CustomerDto dto);

    CustomerDto update(CustomerDto dto);

}
