package com.pepito.InventarioService.Services;
import com.pepito.InventarioService.Models.Inventario;
import com.pepito.InventarioService.Repositories.InventarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventarioService {
    @Autowired
    private InventarioRepository inventarioRepository;
    public List<Inventario> findAll() {
        return inventarioRepository.findAll();
    }
    public Inventario findById(Long id) {
        return inventarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No existe el inventario con el id: " + id));
    }
    public Inventario guardar(Inventario inventario) {
        return inventarioRepository.save(inventario);
    }
}
