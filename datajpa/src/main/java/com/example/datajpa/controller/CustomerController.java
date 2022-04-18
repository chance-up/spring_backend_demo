package com.example.datajpa.controller;

import java.util.ArrayList;

import com.example.datajpa.dto.CustomerDto;
import com.example.datajpa.entity.Customer;
import com.example.datajpa.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CustomerController {
    @Autowired
    CustomerService service;

    int i = 0;

    @GetMapping("/create")
    public @ResponseBody Customer insert() {
        i++;
        return service.insert(Customer.builder().name("name" + i).address("Addr" + i).build());
    }

    @GetMapping("customer/{id}")
    public @ResponseBody CustomerDto get(@PathVariable Long id) {
        return service.get(id);
    }

    @GetMapping("customer")
    public @ResponseBody ArrayList<Customer> getList() {
        return service.getList();
    }

    // @GetMapping("/customer")
    // public @ResponseBody Customer create() {
    // return service.create(dto);
    // }

}
