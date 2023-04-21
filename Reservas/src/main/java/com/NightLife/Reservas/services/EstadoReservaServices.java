package com.NightLife.Reservas.services;

import com.NightLife.Reservas.Entity.EstadoReserva;
import com.NightLife.Reservas.Entity.Reserva;

import java.util.List;
import java.util.Optional;

public interface EstadoReservaServices {

    List<EstadoReserva> listarReservaE();
    EstadoReserva guardarReservaE(EstadoReserva estadoReserva);
    Optional<EstadoReserva> porIdReservaE (Integer id);
    void deletebyIdReservaE (Integer id);
}
