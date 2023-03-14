package com.NightLife.Clientes.services.implementations;

import com.NightLife.Clientes.Entity.Cliente;
import com.NightLife.Clientes.services.ClienteService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ClienteServiceImpl implements ClienteService {
    @Override
    public List<Cliente> listar() {
        return null;
    }

    @Override
    public Cliente guardar(Cliente cliente) {
        return null;
    }

    @Override
    public Optional<Cliente> porId(Integer id) {
        return Optional.empty();
    }
}
