package com.gestionproducto.example.gestionproductos.repository;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Repository;

import com.gestionproducto.example.gestionproductos.model.Product;

@Repository
public class ProductRepository {


    private List<Product>listaProductos = new ArrayList<>();

    public ProductRepository(){
// tener ojo con el orden en como se colocan los datos 
        listaProductos.add(new Product("papel", 2000.0,"papeleria"));
        listaProductos.add(new Product("crema",300.0,"personal"));
        listaProductos.add(new Product("lapiz", 500.0, "papeleria"));
        listaProductos.add(new Product("goma",  500.0, "papeleria"));
        listaProductos.add(new Product("dulces", 100.0, "confitera"));



    }

    public List<Product>listar(){// tener ojo con los nombres
        return listaProductos;
    }

    public List<Product> obtenerProductos(){
        return listaProductos;
    }

    public Product buscarProductoPorNombre(String nombre){
        for(Product producto: listaProductos){
            if(producto.getNombre().equalsIgnoreCase(nombre)){
                return producto;
            }
        }
        return null;
    }

    public Product agregarProducto(Product product){
        listaProductos.add(product);
        return product;

    }

    public boolean eliminarPorNombre(String nombre){
        Product producto = buscarProductoPorNombre(nombre);
        if(producto!= null){
            listaProductos.remove(producto);
            return true;
        }
        return false;
    }
    
}
