package com.springboot.app.productos.models.repository;

import com.springboot.app.productos.models.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
