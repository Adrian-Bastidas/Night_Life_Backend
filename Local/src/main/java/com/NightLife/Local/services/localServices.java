package com.NightLife.Local.services;
import com.NightLife.Local.Entity.Local;

import java.util.List;
import java.util.Optional;

public interface localServices {
    List<Local> listar();
    Local guardar(Local local);
    Optional<Local> porId (Integer id);

    Optional<Local> porNombre(String nombre);
}
