package com.NightLife.Login.Services.Implementations;

import com.NightLife.Login.Entity.Login;
import com.NightLife.Login.Repositories.LoginRepository;
import com.NightLife.Login.Services.LoginServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class LoginServiceImpl implements LoginServices {
    @Autowired
    private LoginRepository repo;

    @Override
    public List<Login> listarUsuarios() {
        return repo.findAll();
    }

    @Override
    public Login guardarUsu(Login login) {
        return repo.save(login);
    }

    @Override
    public Optional<Login> porId(Integer Id) {
        return repo.findById(Id);
    }

    @Override
    public Optional<Login> porCorreoyContrasena(String perCorreo, String perContrasena) {
        return repo.findByperCorreoANDperContrasena(perCorreo, perContrasena);
    }

    @Override
    public void deletebyId(Integer id) {
        repo.deleteById(id);
    }
}
