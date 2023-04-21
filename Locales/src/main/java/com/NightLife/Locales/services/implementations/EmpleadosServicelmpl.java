package com.NightLife.Locales.services.implementations;

import com.NightLife.Locales.Entity.Empleados;
import com.NightLife.Locales.repositories.empleadosRespository;
import com.NightLife.Locales.repositories.localRepository;
import com.NightLife.Locales.services.empleadosServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadosServicelmpl implements empleadosServices {

    @Autowired
    private empleadosRespository repository;
    @Override
    public List<Empleados> listarEm() {
        return repository.findAll();
    }

    @Override
    public Empleados guardarem(Empleados empleados) {
        return repository.save(empleados);
    }

    @Override
    public Optional<Empleados> porId(Integer id) {
        return repository.findById(id);
    }

    @Override
    public void deletebyIdem(Integer id) {
        repository.deleteById(id);
    }
}
