package com.NightLife.Ordenes.services.implementations;

import com.NightLife.Ordenes.Entity.Orden;
import com.NightLife.Ordenes.respositories.OrdenRepository;
import com.NightLife.Ordenes.services.OrdenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class OrdenServices implements OrdenService {

    @Autowired
    private OrdenRepository repository;
    @Override
    public List<Orden> listarOrden() {
        return repository.findAll();
    }

    @Override
    public Orden guardarOrden(Orden orden) {
        return repository.save(orden);
    }

    @Override
    public Optional<Orden> porIdOrden(Integer id) {
        return repository.findById(id);
    }

    @Override
    public void deletebyIdOrden(Integer id)  {
        repository.deleteById(id);

    }
}
