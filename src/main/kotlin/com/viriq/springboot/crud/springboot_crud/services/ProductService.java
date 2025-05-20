package com.viriq.springboot.crud.springboot_crud.services;

import java.util.List;
import java.util.Optional;

import com.viriq.springboot.crud.springboot_crud.entities.Product;

public interface ProductService {

    List<Product> findByAll();

    Optional<Product> findById(Long id);

    Product save(Product unProduct);

    Optional<Product> delete(Product unProduct);

}
