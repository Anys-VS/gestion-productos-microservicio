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
    
    public void agregarProducto(Product producto){
         productRepository.agregarProducto(producto);
    }

    public Product buscaProducto(String producto){
        return productRepository.buscarProductoPorNombre(producto);
    }

    public boolean deleteProducto(String producto){
        productRepository.eliminarPorNombre(producto);
        return productRepository.eliminarPorNombre(producto);
    }
}
