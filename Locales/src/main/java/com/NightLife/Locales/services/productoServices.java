package com.NightLife.Locales.services;

import com.NightLife.Locales.Entity.Local;
import com.NightLife.Locales.Entity.Productos;

import java.util.List;
import java.util.Optional;

public interface productoServices {
    List<Productos> listarProducto();
    Productos guardarProducto(Productos productos);
    Optional<Productos> porIdproducto (Integer id);
    void deletebyIdProducto (Integer id);
}
