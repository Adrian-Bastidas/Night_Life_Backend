package com.NightLife.Cliente.repositories;

import com.NightLife.Cliente.Entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, Integer> {
}
