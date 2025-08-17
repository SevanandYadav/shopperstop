package com.arsenal.ecomm.shopperstop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;

import com.arsenal.ecomm.shopperstop.entity.Product;
import com.arsenal.ecomm.shopperstop.repository.ProductRepository;

@Service
public class ProductService {
    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    @Cacheable("products")
    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    @Cacheable(value = "product", key = "#id")
    public Optional<Product> getProductById(Long id) {
        return repository.findById(id);
    }

    @CacheEvict(value = {"products", "product"}, allEntries = true)
    public Product createProduct(Product product) {
        return repository.save(product);
    }

    @CacheEvict(value = {"products", "product"}, allEntries = true)
    public Product updateProduct(Long id, Product product) {
        product.setId(id);
        return repository.save(product);
    }

    @CacheEvict(value = {"products", "product"}, allEntries = true)
    public void deleteProduct(Long id) {
        repository.deleteById(id);
    }

    @CacheEvict(value = {"products", "product"}, allEntries = true)
    public List<Product> createProducts(List<Product> products) {
        return repository.saveAll(products);
    }
}