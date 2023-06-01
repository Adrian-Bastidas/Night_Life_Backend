package com.NightLife.Locales.repositories;

import com.NightLife.Locales.Entity.Productos;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface productoRepository extends JpaRepository<Productos, Integer> {
    @Query(value = "SELECT * FROM Productos WHERE Local = ?1", nativeQuery = true)
    List<Productos> findByLocal(Integer Local);
}
