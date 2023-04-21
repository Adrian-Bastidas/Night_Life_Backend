package com.NightLife.Locales.controllers;

import com.NightLife.Locales.Entity.Empleados;
import com.NightLife.Locales.Entity.Local;
import com.NightLife.Locales.services.empleadosServices;
import com.NightLife.Locales.services.localServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/getEmpleado")
@CrossOrigin(value="*")
public class empleadosGetController {
    @Autowired
    private empleadosServices services;
    @GetMapping("/listarEmpleados")
    public ResponseEntity<List<Empleados>> listarEmpleados(){ return ResponseEntity.ok(services.listarEm());}

    @GetMapping("/{id}")
    public ResponseEntity<Empleados> porId(@PathVariable Integer id) {
        Optional<Empleados> o = services.porId(id);
        if (o.isPresent()){
            return  ResponseEntity.ok(o.get());
        }
        return ResponseEntity.notFound().build();
    }
}

