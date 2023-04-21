package com.NightLife.Reservas.repositories;

import com.NightLife.Reservas.Entity.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservRepository extends JpaRepository<Reserva, Integer> {
}
