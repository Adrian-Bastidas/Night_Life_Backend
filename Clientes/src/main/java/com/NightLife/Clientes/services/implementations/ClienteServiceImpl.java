package com.NightLife.Clientes.services.implementations;

import com.NightLife.Clientes.Entity.Cliente;
import com.NightLife.Clientes.repositories.ClienteRepository;
import com.NightLife.Clientes.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.PrivateKey;
import java.util.List;
import java.util.Optional;
@Service

public class ClienteServiceImpl implements ClienteService  {
    @Autowired
    private ClienteRepository repository;
    @Override
    public List<Cliente> listar() {return repository.findAll();}

    @Override
    public Cliente guardar(Cliente cliente) {return repository.save(cliente);
    }
    @Override
    public Optional<Cliente> porId(Integer id) {return repository.findById(id);
    }

    @Override
    public void deletebyId(Integer id) {repository.deleteById(id);
    }

}
