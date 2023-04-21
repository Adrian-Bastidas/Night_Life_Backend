package com.NightLife.Locales.repositories;

import com.NightLife.Locales.Entity.Productos;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface productoRepository extends JpaRepository<Productos, Integer> {

}
