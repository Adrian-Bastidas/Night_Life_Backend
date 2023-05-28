package com.NightLife.Locales.services;

import com.NightLife.Locales.Entity.Empleados;
import com.NightLife.Locales.Entity.Productos;

import java.util.List;
import java.util.Optional;

public interface empleadosServices {

    List<Empleados> listarEm();
    Empleados guardarem(Empleados empleados);
    Optional<Empleados> porId (Integer id);
    void deletebyIdem (Integer id);
    List<Empleados> listarPorLocal(Integer Local);
}
