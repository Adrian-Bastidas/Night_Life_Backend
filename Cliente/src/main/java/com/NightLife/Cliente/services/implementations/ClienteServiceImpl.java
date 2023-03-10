package com.NightLife.Cliente.services.implementations;

import com.NightLife.Cliente.Entity.Cliente;
import com.NightLife.Cliente.repositories.ClienteRepository;
import com.NightLife.Cliente.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClienteRepository repository;
    @Override
    public List<Cliente> listar() {
        return (List<Cliente>) repository.findAll();
    }

    @Override
    public Cliente guardar(Cliente cliente) {
        return repository.save(cliente);
    }

    @Override
    public Optional<Cliente> porId(Integer id) {
        return repository.findById(id);
    }
}
