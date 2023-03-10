package com.NightLife.Cliente.services;

import com.NightLife.Cliente.Entity.Cliente;

import java.util.List;
import java.util.Optional;

public interface ClienteService {
    List<Cliente> listar();
    Cliente guardar(Cliente cliente);
    Optional<Cliente> porId (Integer id);
}
