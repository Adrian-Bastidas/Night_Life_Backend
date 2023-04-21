package com.NightLife.Ordenes.controllers;

import com.NightLife.Ordenes.Entity.Orden;
import com.NightLife.Ordenes.services.OrdenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@RestController
@RequestMapping("/actions")
@CrossOrigin("*")
public class OrdenQueryController {

    @Autowired
    private OrdenService service;
    @PostMapping("/postOrden")
    public ResponseEntity<?> crearE(@RequestBody Orden orden){
        Orden estadoReservaDB= service.guardarOrden(orden);
        return ResponseEntity.status(HttpStatus.CREATED).body(estadoReservaDB);
    }
    @PutMapping("/putOrden{id}")
    public ResponseEntity<?> editarE (@RequestBody Orden orden, @RequestParam Integer id){
        Optional<Orden> o = service.porIdOrden(id);
        if(o.isPresent()){
            Orden ordenDB =o.get();
            ordenDB.setOrdFecha(ordenDB.getOrdFecha());
            return ResponseEntity.status(HttpStatus.CREATED).body(service.guardarOrden(ordenDB));
        }
        else
            return ResponseEntity.notFound().build();
    }
    @DeleteMapping("/deleteOrden/{id}")
    public  ResponseEntity<?> deletebyIdReservaE (@PathVariable int id){
        this.service.deletebyIdOrden(id);
        return ResponseEntity.ok(Boolean.TRUE);
    }
}
