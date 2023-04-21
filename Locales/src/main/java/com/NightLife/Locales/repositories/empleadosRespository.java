package com.NightLife.Locales.repositories;

import com.NightLife.Locales.Entity.Empleados;
import com.NightLife.Locales.Entity.Local;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface empleadosRespository  extends JpaRepository<Empleados, Integer> {

}
