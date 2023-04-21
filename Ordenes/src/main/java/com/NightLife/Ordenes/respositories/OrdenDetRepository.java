package com.NightLife.Ordenes.respositories;

import com.NightLife.Ordenes.Entity.OrdenDetails;
import io.swagger.models.auth.In;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdenDetRepository extends JpaRepository<OrdenDetails, Integer> {
}
