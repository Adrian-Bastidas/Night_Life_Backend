package com.NightLife.Reservas.services;

import com.NightLife.Reservas.Entity.Reserva;
import com.NightLife.Reservas.ReservasApplication;

import java.util.List;
import java.util.Optional;

public interface ReservaService {

    List<Reserva> listarReserva();
    Reserva guardarReserva(Reserva reserva);
    Optional<Reserva> porIdReserva (Integer id);
    void deletebyIdReserva (Integer id);
}
