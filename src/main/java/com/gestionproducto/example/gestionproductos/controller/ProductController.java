package com.gestionproducto.example.gestionproductos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestionproducto.example.gestionproductos.model.Product;
import com.gestionproducto.example.gestionproductos.service.ProductService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
@RequestMapping("/api/v1/products")// 
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product>listaProductos(){
        return productService.getProductos();
        
    }

    //AGREGAR ENTITY LO QUE SE SOLICITA EN EL EJERCICIO

    @GetMapping
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    

    @PostMapping
    public Product agreProducto(@RequestBody Product producto) {
        return productService.agregarProducto(producto);
    }
    
    @DeleteMapping("{nombre}")
    public String eliminarProducto(@PathVariable String nombre){
        return productService.deleteProducto(nombre);
    }


    
}
