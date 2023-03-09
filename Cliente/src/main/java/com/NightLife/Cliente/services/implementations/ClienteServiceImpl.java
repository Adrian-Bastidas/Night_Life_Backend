package com.NightLife.Cliente.services.implementations;

import com.NightLife.Cliente.Entity.Cliente;
import com.NightLife.Cliente.repositories.ClienteRepository;
import com.NightLife.Cliente.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClienteRepository repository;
    @Override
    public List<Cliente> listar() {
        return (List<Cliente>) repository.findAll();
    }
}
