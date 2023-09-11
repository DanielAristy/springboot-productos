package com.springboot.app.productos.controllers;

import com.springboot.app.productos.models.entity.Product;
import com.springboot.app.productos.models.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private IProductoService productoService;

    @GetMapping("listar")
    public List<Product> listar(){
        return productoService.findAll();
    }

    @GetMapping("listar/{id}")
    public Product detalle(@PathVariable Long id){
        return productoService.findById(id);
    }
}
