package com.NightLife.Reservas.controllers;

import com.NightLife.Reservas.Entity.EstadoReserva;
import com.NightLife.Reservas.Entity.Reserva;
import com.NightLife.Reservas.services.EstadoReservaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/actions")
@CrossOrigin("*")
public class estadoReservaQueryController {
    @Autowired
    private EstadoReservaServices services;

    @PostMapping("/postEstadoReserva")
    public ResponseEntity<?> crearE(@RequestBody EstadoReserva estadoReserva){
        EstadoReserva estadoReservaDB= services.guardarReservaE(estadoReserva);
        return ResponseEntity.status(HttpStatus.CREATED).body(estadoReservaDB);
    }
    @PutMapping("/putEstado{id}")
    public ResponseEntity<?> editarE (@RequestBody EstadoReserva estadoReserva, @RequestParam Integer id){
        Optional<EstadoReserva> o = services.porIdReservaE(id);
        if(o.isPresent()){
            EstadoReserva estadoReservaDB =o.get();
            estadoReservaDB.setEsEstado(estadoReserva.getEsEstado());
            return ResponseEntity.status(HttpStatus.CREATED).body(services.guardarReservaE(estadoReservaDB));
        }
        else
            return ResponseEntity.notFound().build();
    }
    @DeleteMapping ("/deleteReserva/{id}")
    public  ResponseEntity<?> deletebyIdReservaE (@PathVariable int id){
        this.services.deletebyIdReservaE(id);
        return ResponseEntity.ok(Boolean.TRUE);
    }
}
