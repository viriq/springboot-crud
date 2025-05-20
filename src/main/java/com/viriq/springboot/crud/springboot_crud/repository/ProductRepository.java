package com.viriq.springboot.crud.springboot_crud.repository;

import org.springframework.data.repository.CrudRepository;
import com.viriq.springboot.crud.springboot_crud.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
