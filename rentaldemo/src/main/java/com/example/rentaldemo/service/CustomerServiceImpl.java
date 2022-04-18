package com.example.rentaldemo.service;

import com.example.rentaldemo.entity.Customer;
import com.example.rentaldemo.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer create(Customer customer) {
        System.out.println("!!!!!!!!!!!!!!!!!Service!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println(customer);
        // Customer customer1 = Customer.builder().build();
        // BeanUtils.copyProperties(customer1, customer, "id");
        // customerRepository.save(customer);

        return customerRepository.save(customer);
    }

}
