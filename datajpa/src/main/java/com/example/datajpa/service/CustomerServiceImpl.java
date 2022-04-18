package com.example.datajpa.service;

import java.util.ArrayList;

import com.example.datajpa.dto.CustomerDto;
import com.example.datajpa.entity.Customer;
import com.example.datajpa.repository.CustomerRepository;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository repository;

    @Override
    public Customer insert(Customer customer) {
        System.out.println("CustomerServiceImpl.insert()");
        return repository.save(customer);
    }

    @Override
    public CustomerDto get(Long id) {
        System.out.println("CustomerServiceImpl.get()");
        Customer customer = repository.findById(id).get();
        CustomerDto dto = CustomerDto.builder().build();
        BeanUtils.copyProperties(customer, dto, "id");
        return dto;
    }

    @Override
    public ArrayList<Customer> getList() {
        System.out.println("CustomerServiceImpl.customerList()");
        return (ArrayList<Customer>) repository.findAll();
    }

    @Override
    public CustomerDto create(CustomerDto dto) {
        Customer customer = Customer.builder().build();
        BeanUtils.copyProperties(dto, customer, "id");
        repository.save(customer);
        return dto;
    }

}
