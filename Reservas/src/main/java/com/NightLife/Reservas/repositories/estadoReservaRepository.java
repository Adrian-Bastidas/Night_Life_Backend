package com.NightLife.Reservas.repositories;

import com.NightLife.Reservas.Entity.EstadoReserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface estadoReservaRepository extends JpaRepository<EstadoReserva, Integer> {
}
