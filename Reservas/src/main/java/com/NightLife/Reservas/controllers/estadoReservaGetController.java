package com.NightLife.Reservas.controllers;

import com.NightLife.Reservas.Entity.EstadoReserva;
import com.NightLife.Reservas.Entity.Reserva;
import com.NightLife.Reservas.services.EstadoReservaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/getEstadoReserva")
@CrossOrigin(value="*")
public class estadoReservaGetController {
    @Autowired
    private EstadoReservaServices services;
    @GetMapping("/listarEstadoReservas")
    public ResponseEntity<List<EstadoReserva>> listarReservaE() {
        return ResponseEntity.ok(services.listarReservaE());
    }
    @GetMapping("/{id}")
    public ResponseEntity<EstadoReserva> porIdReservaE(@PathVariable Integer id) {
        Optional<EstadoReserva> o = services.porIdReservaE(id);
        if (o.isPresent()){
            return  ResponseEntity.ok(o.get());
        }
        return ResponseEntity.notFound().build();
    }
}
