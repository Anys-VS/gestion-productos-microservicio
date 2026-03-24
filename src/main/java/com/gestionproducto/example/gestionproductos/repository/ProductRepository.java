package com.gestionproducto.example.gestionproductos.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.gestionproducto.example.gestionproductos.model.Product;

@Repository
public class ProductRepository {

    private List<Product>listaProductos = new ArrayList<>();

    public ProductRepository(){

        listaProductos.add(new Product("papel", "papeleria", 2000));
        listaProductos.add(new Product("crema", "aseo personal", 3800));
        listaProductos.add(new Product("lapiz", "papeleria", 500));
        listaProductos.add(new Product("goma", "papeleria", 500));
        listaProductos.add(new Product("dulces", "confitera", 1000));



    }

    public List<Product> obtenerProductos(){
        return listaProductos;
    }

    public Product buscarProducto(String nombre){
        for(Product producto: listaProductos){
            if(producto.getNombre() == nombre){
                return producto;
            }
        }
        return null;
    }

    public Product agregarProducto(Product product){
        listaProductos.add(product);
        return product;

    }

    public void eliminar(String nombre){
        Product producto = buscarProducto(nombre);
        if(producto!= null){
            listaProductos.remove(producto);
        }
    }
    
}
