package com.springboot.app.productos.models.service;

import com.springboot.app.productos.models.entity.Product;
import com.springboot.app.productos.models.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class ProductoServiceImpl implements IProductoService{

    @Autowired
    private  ProductRepository repository;
    @Override
    @Transactional(readOnly = true)
    public List<Product> findAll() {
        return (List<Product>) repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Product findById(Long id) {
        return repository.findById(id).orElse(null);
    }
}
