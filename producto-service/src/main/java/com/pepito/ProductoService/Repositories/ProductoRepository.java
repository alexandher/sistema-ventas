package com.pepito.ProductoService.Repositories;

import com.pepito.ProductoService.Models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}