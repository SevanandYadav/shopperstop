package com.arsenal.ecomm.shopperstop.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arsenal.ecomm.shopperstop.entity.Product;
@RestController
@RequestMapping("/products")
public class ProductController {
    //private final ProductRepository repository;

    // public ProductController(ProductRepository repository) {
    //     this.repository = repository;
    // }

    @GetMapping
    public List<Product> getAllProducts() {
       // return repository.findAll();
       List<Product> products  = getAllMockProducts();
       return products;
    }
    List<Product>  getAllMockProducts(){
        List<Product> products = new ArrayList<>();
        for(int i = 1; i <= 5; i++) {
            Product product = new Product();
            product.setId((long) i);
            product.setName("Product " + i);
            product.setPrice(10.0 * i);
            products.add(product);
        }
        return products;
    }
}