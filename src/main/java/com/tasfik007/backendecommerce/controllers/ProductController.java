package com.tasfik007.backendecommerce.controllers;

import com.tasfik007.backendecommerce.database.models.Product;
import com.tasfik007.backendecommerce.database.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping({"","/"})
    public List<Product> getAll(){
        return productService.getAll();
    }

    @GetMapping(path="/{id}")
    public Product getById(@PathVariable("id") Integer id){
        return productService.getById(id);
    }
}
