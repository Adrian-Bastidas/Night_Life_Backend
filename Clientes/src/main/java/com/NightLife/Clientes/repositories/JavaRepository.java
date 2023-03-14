package com.NightLife.Clientes.repositories;

import com.NightLife.Clientes.Entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JavaRepository extends JpaRepository<Cliente,Integer> {
}
