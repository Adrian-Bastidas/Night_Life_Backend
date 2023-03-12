package com.NightLife.Local.repositories;

import com.NightLife.Local.Entity.Local;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface localRepository extends CrudRepository<Local,Integer> {
    Local findByLocNombre(String locNombre);

}
