package com.NightLife.Reservas.services.implementations;

import com.NightLife.Reservas.Entity.EstadoReserva;
import com.NightLife.Reservas.repositories.estadoReservaRepository;
import com.NightLife.Reservas.services.EstadoReservaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EstadoReservaImpl implements EstadoReservaServices {
   @Autowired
    private estadoReservaRepository repository;
    @Override
    public List<EstadoReserva> listarReservaE() {
        return repository.findAll();
    }

    @Override
    public EstadoReserva guardarReservaE(EstadoReserva estadoReserva) {
        return repository.save(estadoReserva);
    }

    @Override
    public Optional<EstadoReserva> porIdReservaE(Integer id) {
        return repository.findById(id);
    }

    @Override
    public void deletebyIdReservaE(Integer id)  {
        repository.deleteById(id);

    }
}
