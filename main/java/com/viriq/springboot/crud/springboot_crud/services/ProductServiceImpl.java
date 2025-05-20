package com.viriq.springboot.crud.springboot_crud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.viriq.springboot.crud.springboot_crud.entities.Product;
import com.viriq.springboot.crud.springboot_crud.repository.ProductRepository;

public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<Product> findByAll() {
        return (List<Product>) repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Product> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public Optional<Product> delete(Product product) {
        Optional<Product> productOptional = repository.findById(product.getId());
        productOptional.ifPresent(productoDb -> {
            repository.delete(productoDb);
        });
        return productOptional;
    }

    @Override
    @Transactional
    public Product save(Product product) {
        return repository.save(product);
    }

}
