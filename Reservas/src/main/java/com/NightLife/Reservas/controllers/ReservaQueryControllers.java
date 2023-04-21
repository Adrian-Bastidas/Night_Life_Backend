package com.NightLife.Reservas.controllers;

import com.NightLife.Reservas.Entity.Reserva;
import com.NightLife.Reservas.services.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/actions")
@CrossOrigin("*")
public class ReservaQueryControllers {

    @Autowired
    private ReservaService service;

    @PostMapping("/postReserva")

    public ResponseEntity<?> creara(@RequestBody Reserva reserva){
        Reserva reservaDB= service.guardarReserva(reserva);
        return ResponseEntity.status(HttpStatus.CREATED).body(reservaDB);

    }
    @PutMapping("/{id}")

    public ResponseEntity<?> editara (@RequestBody Reserva cliente, @RequestParam Integer id){
        Optional<Reserva> o = service.porIdReserva(id);
        if(o.isPresent()){
            Reserva reservaDB =o.get();
            reservaDB.setResFecha(cliente.getResFecha());
            reservaDB.setResActividad(cliente.getResActividad());
            reservaDB.setResLocal(cliente.getResLocal());
            reservaDB.setResHoraInicio(cliente.getResHoraInicio());
            reservaDB.setResHoraFin(cliente.getResHoraFin());
            reservaDB.setResPrecio(cliente.getResPrecio());
            return ResponseEntity.status(HttpStatus.CREATED).body(service.guardarReserva(reservaDB));
        }
        else
            return ResponseEntity.notFound().build();
    }
    @DeleteMapping ("/delete/{id}")
    public  ResponseEntity<?> deleteUsera (@PathVariable int id){
        this.service.deletebyIdReserva(id);
        return ResponseEntity.ok(Boolean.TRUE);
    }
}

