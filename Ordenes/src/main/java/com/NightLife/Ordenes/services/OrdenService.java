package com.NightLife.Ordenes.services;

import com.NightLife.Ordenes.Entity.Orden;
import org.aspectj.weaver.ast.Or;

import java.util.List;
import java.util.Optional;

public interface OrdenService {

    List<Orden> listarOrden();
    Orden guardarOrden(Orden orden);
    Optional<Orden> porIdOrden (Integer id);
    void deletebyIdOrden(Integer id);
}
