package com.tasfik007.backendecommerce.database.repositories;

import com.tasfik007.backendecommerce.database.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
