package com.pepito.InventarioService.Controllers;

import com.pepito.InventarioService.Models.Inventario;
import com.pepito.InventarioService.Services.InventarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/inventarios")
public class InventarioController {
    @Autowired
    private InventarioService inventarioService;
    @PostMapping
    public Inventario crearInventario(@RequestBody Inventario inventario){
        return inventarioService.guardar(inventario);
    }
    @GetMapping("/{id}")
    public Inventario obtenerInventarioPorId(@PathVariable Long id){
        return inventarioService.findById(id);
    }
    @GetMapping
    public List<Inventario> obtenerTodosLosInventarios(){
        return inventarioService.findAll();
    }
}
