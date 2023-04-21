package com.NightLife.Locales.services;

import com.NightLife.Locales.Entity.Local;

import java.util.List;
import java.util.Optional;

public interface localServices {
    List<Local> listar();
    Local guardar(Local local);
    Optional<Local> porId (Integer id);
    Optional<Local> porNombre(String nombre);
    void deletebyId (Integer id);
}
