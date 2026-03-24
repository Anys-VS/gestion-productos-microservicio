package com.gestionproducto.example.gestionproductos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private String nombre;
    private String categoria;
    private int precio;
    
}
