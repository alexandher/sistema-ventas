package com.pepito.pedidosService.DTOs;

import lombok.Data;

@Data
public class Producto {
    private Long id;
    private String nombre;
    private Double precio;
}