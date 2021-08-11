package com.tasfik007.backendecommerce.database.services;

import com.tasfik007.backendecommerce.database.models.Product;
import com.tasfik007.backendecommerce.database.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public List<Product> getAll(){
        return productRepository.findAll();
    }
    public Product getById(Integer id){
        return productRepository.getById(id);
    }
    @Transactional
    public Product create(Product product){
        return productRepository.save(product);
    }
    @Transactional
    public Product update(Product newProduct){
        Product oldProduct = getById(newProduct.getId());
        oldProduct.setName(newProduct.getName());
        oldProduct.setPrice(newProduct.getPrice());
        return newProduct;
    }
    @Transactional
    public void delete(Integer id){
        productRepository.deleteById(id);
    }
}
