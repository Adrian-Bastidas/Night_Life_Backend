package com.NightLife.Locales.services.implementations;
import com.NightLife.Locales.Entity.Local;
import com.NightLife.Locales.repositories.localRepository;
import com.NightLife.Locales.services.localServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class LocalServiceImpl implements localServices {
    @Autowired
    private localRepository repository;

    @Override
    public List<Local> listar() {
        return repository.findAll();
    }

    @Override
    public Local guardar(Local local) {
        return repository.save(local);
    }

    @Override
    public Optional<Local> porId(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Optional<Local> porNombre(String nombre) {
        return Optional.ofNullable(repository.findByLocNombre(nombre));
    }
    @Override
    public void deletebyId(Integer id) {repository.deleteById(id);
    }
}
