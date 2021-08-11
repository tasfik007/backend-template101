package com.tasfik007.backendecommerce.database.services;

import com.tasfik007.backendecommerce.database.models.Customer;
import com.tasfik007.backendecommerce.database.repositories.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;

    public List<Customer> getAll(){
        return customerRepository.findAll();
    }
    public Customer getById(Integer id){
        return customerRepository.getById(id);
    }
    @Transactional
    public Customer create(Customer customer){
        return customerRepository.save(customer);
    }
    @Transactional
    public Customer update(Customer newCustomer){
        Customer oldCustomer = getById(newCustomer.getId());
        oldCustomer.setName(newCustomer.getName());
        oldCustomer.setEmail(newCustomer.getEmail());
        return newCustomer;
    }
    @Transactional
    public void delete(Integer id){
        customerRepository.deleteById(id);
    }
}
