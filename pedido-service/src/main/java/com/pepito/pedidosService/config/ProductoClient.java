package com.pepito.pedidosService.config;

import com.pepito.pedidosService.DTOs.Producto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "producto-service")
public interface ProductoClient {
    @GetMapping("/api/v1/productos/{id}")
    Producto obtenerProductoPorId(@PathVariable Long id);
}
