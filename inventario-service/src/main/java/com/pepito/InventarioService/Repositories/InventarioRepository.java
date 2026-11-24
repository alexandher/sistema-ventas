package com.pepito.InventarioService.Repositories;

import com.pepito.InventarioService.Models.Inventario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventarioRepository extends JpaRepository<Inventario, Long> {
}
