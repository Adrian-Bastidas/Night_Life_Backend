package com.NightLife.Login.Repositories;

import com.NightLife.Login.Entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface LoginRepository extends JpaRepository<Login,Integer> {
    @Query(value = "SELECT * FROM login WHERE per_correo = ?1 AND per_contrasena = ?2", nativeQuery = true)
    Optional<Login> findByperCorreoANDperContrasena(String per_correo, String per_contrasena);
}
