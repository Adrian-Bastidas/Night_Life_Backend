package com.NightLife.Ordenes.controllers;

import com.NightLife.Ordenes.Entity.Orden;
import com.NightLife.Ordenes.services.OrdenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/getOrden")
@CrossOrigin(value="*")
public class OrdenGetController {

    @Autowired
    private OrdenService services;
    @GetMapping("/listarOrden")
    public ResponseEntity<List<Orden>> listarOrden() {
        return ResponseEntity.ok(services.listarOrden());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Orden> porIdOrden(@PathVariable Integer id) {
        Optional<Orden> o = services.porIdOrden(id);
        if (o.isPresent()){
            return  ResponseEntity.ok(o.get());
        }
        return ResponseEntity.notFound().build();
    }
}
