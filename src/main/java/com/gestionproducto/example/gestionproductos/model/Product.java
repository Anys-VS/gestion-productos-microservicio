package com.gestionproducto.example.gestionproductos.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // getter and setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    // black -
    @NotBlank(message= "El nombre mo puede estar vacio")
    private String nombre;
  @NotNull(message = " El precio no puede ser nulo")

    private Double precio;

          @NotBlank(message= "la categori NO PUEDE ESTAR VACIA")
    private String categoria;
    
}

//Primero en la creacion del proyecto las dependencias q sumamos son lombok , spring web, validation
// en extension verificar que se encuentre instalado el cafesito
//controller 

//aqui en modelo creamos una clase Product 

//MODEL --> REPOSITORY --> SERVICE --> CONTROLLER

// PRODUCTO ES UN OBJETO DE TIPO 

PUERTO : LOCALHOST:8080//