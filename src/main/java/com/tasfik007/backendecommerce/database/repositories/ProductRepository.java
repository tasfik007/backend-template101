package com.tasfik007.backendecommerce.database.repositories;

import com.tasfik007.backendecommerce.database.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
