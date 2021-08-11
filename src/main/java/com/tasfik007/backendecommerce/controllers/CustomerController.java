package com.tasfik007.backendecommerce.controllers;

import com.tasfik007.backendecommerce.database.models.Customer;
import com.tasfik007.backendecommerce.database.services.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping
    public List<Customer> getAll(){
        return customerService.getAll();
    }

    @GetMapping(path="/{id}")
    public Customer getById(@PathVariable("id") Integer id) throws Exception {
        return customerService.getById(id);
    }

}
