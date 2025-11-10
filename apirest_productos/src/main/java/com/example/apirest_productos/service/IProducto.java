package com.example.apirest_productos.service;

import com.example.apirest_productos.entity.Producto;

import java.util.List;

public interface IProducto {
    Producto save(Producto producto);
    List<Producto> findAll();

    Producto findById(Integer id);
    void deleteById(Integer id);
}
