package com.example.rentaldemo.controller;

import com.example.rentaldemo.dto.CustomerDto;
import com.example.rentaldemo.entity.Customer;
import com.example.rentaldemo.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    CustomerService service;

    int i = 0;

    @GetMapping("/")
    public String hello() {
        return "Hello World";
    }

    // @GetMapping("/create")
    // public CustomerDto createCustomer() {
    // return CustomerDto.builder()
    // .name("John")
    // .address("123 Main St")
    // .build();
    // }

    @GetMapping("/create")
    public @ResponseBody Customer create() {
        i++;
        Customer customer = Customer.builder().name("name" + i).address("Addr" + i).build();
        System.out.println("!!!!!!!!!!!!!!!!!Controller!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println(customer.toString());

        return service.create(customer);
    }

}
