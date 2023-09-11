package com.springboot.app.productos.models.service;

import com.springboot.app.productos.models.entity.Product;

import java.util.List;

public interface IProductoService {

    public List<Product> findAll();
    public Product findById(Long id);
}
