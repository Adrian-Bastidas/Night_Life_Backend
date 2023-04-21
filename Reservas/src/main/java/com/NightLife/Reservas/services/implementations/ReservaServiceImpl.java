package com.NightLife.Reservas.services.implementations;

import com.NightLife.Reservas.Entity.Reserva;
import com.NightLife.Reservas.repositories.ReservRepository;
import com.NightLife.Reservas.services.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservaServiceImpl implements ReservaService {

    @Autowired
    private ReservRepository repository;

    @Override
    public List<Reserva> listarReserva() {
        return repository.findAll();
    }

    @Override
    public Reserva guardarReserva(Reserva reserva) {
        return repository.save(reserva);
    }

    @Override
    public Optional<Reserva> porIdReserva(Integer id) {
        return repository.findById(id);
    }

    @Override
    public void deletebyIdReserva(Integer id) {
        repository.deleteById(id);
        {

        }
    }
}