package com.pepito.InventarioService.Models;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Inventario {
    @Id
    @GeneratedValue
    private Long id;
    private Long idProducto;
    private Integer cantidad;
    private String ubicacion;
}
