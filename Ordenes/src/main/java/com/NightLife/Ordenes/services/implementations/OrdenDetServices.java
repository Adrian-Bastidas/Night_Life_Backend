package com.NightLife.Ordenes.services.implementations;

import com.NightLife.Ordenes.Entity.Orden;
import com.NightLife.Ordenes.Entity.OrdenDetails;
import com.NightLife.Ordenes.respositories.OrdenDetRepository;
import com.NightLife.Ordenes.services.OrdenDetService;
import com.NightLife.Ordenes.services.OrdenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class OrdenDetServices implements OrdenDetService {
    @Autowired
    private OrdenDetRepository repository;
    @Override
    public List<OrdenDetails> listarOrdenDet() {
        return repository.findAll();
    }

    @Override
    public OrdenDetails guardarOrdenDet(OrdenDetails ordenDetails) {
        return repository.save(ordenDetails);

    }

    @Override
    public Optional<OrdenDetails> porIdOrdenDet(Integer id) {
        return repository.findById(id);
    }

    @Override
    public void deletebyIdOrdenDet(Integer id) {
        repository.deleteById(id);

    }
}
