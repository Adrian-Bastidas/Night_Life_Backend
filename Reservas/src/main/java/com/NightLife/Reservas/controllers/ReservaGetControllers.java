package com.NightLife.Reservas.controllers;

import com.NightLife.Reservas.Entity.Reserva;
import com.NightLife.Reservas.services.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/getReservas")
@CrossOrigin(value="*")
public class ReservaGetControllers {

    @Autowired
    private ReservaService service;

    @GetMapping("/listarReservas")
    public ResponseEntity<List<Reserva>> listarReserva() {
        return ResponseEntity.ok(service.listarReserva());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Reserva> porIdReserva(@PathVariable Integer id) {
        Optional<Reserva> o = service.porIdReserva(id);
        if (o.isPresent()){
            return  ResponseEntity.ok(o.get());
        }
        return ResponseEntity.notFound().build();
    }
}
