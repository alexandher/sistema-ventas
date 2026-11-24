package com.pepito.ProductoService.Services;
import com.pepito.ProductoService.Models.Producto;
import com.pepito.ProductoService.Repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository productoRepository;
    public List<Producto> findAll() {
        return productoRepository.findAll();
    }
    public Producto findById(Long id) {
        return productoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No existe el producto con el id: " + id));
    }
    public Producto guardar(Producto producto) {
        return productoRepository.save(producto);
    }
}
