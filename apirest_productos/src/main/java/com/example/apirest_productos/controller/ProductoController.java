package com.example.apirest_productos.controller;

import com.example.apirest_productos.entity.Producto;
import com.example.apirest_productos.service.IProducto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductoController {

    private IProducto iProducto;

    public ProductoController(IProducto iProducto) {
        this.iProducto = iProducto;
    }

    @PostMapping
    public Producto save(@RequestBody Producto producto){//Transformamos de un objeto JSON a un objeto Producto
        return iProducto.save(producto);
    }


}
