package com.NightLife.Locales.services.implementations;

import com.NightLife.Locales.Entity.Productos;
import com.NightLife.Locales.repositories.localRepository;
import com.NightLife.Locales.repositories.productoRepository;
import com.NightLife.Locales.services.productoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProductosServiceImpl implements productoServices {

    @Autowired
    private productoRepository repository;
    @Override
    public List<Productos> listarProducto() {
        return repository.findAll();
    }

    @Override
    public Productos guardarProducto(Productos productos) {
        return repository.save(productos);
    }

    @Override
    public Optional<Productos> porIdproducto(Integer id) {
        return repository.findById(id);
    }
    @Override
    public void deletebyIdProducto(Integer id) {

    }

    @Override
    public List<Productos> listarPorLocal(Integer Local) {
        return repository.findByLocal(Local);
    }
}
