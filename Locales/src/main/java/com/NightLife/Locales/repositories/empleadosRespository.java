package com.NightLife.Locales.repositories;

import com.NightLife.Locales.Entity.Empleados;
import com.NightLife.Locales.Entity.Local;
import com.NightLife.Locales.Entity.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface empleadosRespository  extends JpaRepository<Empleados, Integer> {
    @Query(value = "SELECT * FROM persona WHERE Local = ?1", nativeQuery = true)
    List<Empleados> findByLocal(Integer Local);
}
