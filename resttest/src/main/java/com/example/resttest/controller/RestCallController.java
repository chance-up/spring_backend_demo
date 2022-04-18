package com.example.resttest.controller;

import java.util.List;

import com.example.resttest.entity.Customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestCallController {
    // @Value("${customer.service.url}")
    // private String SERVER_URL;

    RestTemplate template = new RestTemplate();

    @GetMapping("/restcall/{id}")
    public Customer restCall(@PathVariable("id") Long id) {
        // Customer customer = template.getForObject(SERVER_URL + id, Customer.class);
        // return template.getForObject(SERVER_URL + id, Customer.class);
        return template.getForObject("http://localhost:8080/customer/" + id, Customer.class);
    }

    @GetMapping("/restcall")
    public List<Customer> restCallAll() {
        return template.getForObject("http://localhost:8080/customer/", List.class);
    }

}
