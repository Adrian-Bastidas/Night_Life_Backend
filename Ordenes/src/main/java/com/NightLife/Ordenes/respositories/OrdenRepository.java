package com.NightLife.Ordenes.respositories;

import com.NightLife.Ordenes.Entity.Orden;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdenRepository extends JpaRepository<Orden, Integer> {
}
