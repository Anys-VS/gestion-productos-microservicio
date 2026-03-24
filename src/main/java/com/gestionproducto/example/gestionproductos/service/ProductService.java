package com.gestionproducto.example.gestionproductos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionproducto.example.gestionproductos.model.Product;
import com.gestionproducto.example.gestionproductos.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getProductos(){
        return productRepository.obtenerProductos();
    }
    
    public Product agregarProducto(Product producto){
        return productRepository.agregarProducto(producto);
    }

    public Product buscaProducto(String producto){
        return productRepository.buscarProducto(producto);
    }

    public String deleteProducto(String producto){
        productRepository.eliminar(producto);
        return "Producto eliminado";
    }
}
