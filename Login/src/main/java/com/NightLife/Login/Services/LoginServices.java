package com.NightLife.Login.Services;

import com.NightLife.Login.Entity.Login;
import org.apache.juli.logging.Log;

import java.util.List;
import java.util.Optional;

public interface LoginServices {
    List<Login> listarUsuarios();
    Login guardarUsu(Login login);
    Optional<Login> porId(Integer Id);
    Optional<Login> porCorreoyContrasena(String per_correo, String per_contrasena);
    void deletebyId (Integer id);
}
