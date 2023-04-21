package com.NightLife.Ordenes.controllers;

import com.NightLife.Ordenes.Entity.Orden;
import com.NightLife.Ordenes.Entity.OrdenDetails;
import com.NightLife.Ordenes.services.OrdenDetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/actions")
@CrossOrigin("*")
public class OrdenDetQueryController {
    @Autowired
    private OrdenDetService service;
    @PostMapping("/postOrdenDet")
    public ResponseEntity<?> crearDet(@RequestBody OrdenDetails ordenDetails){
        OrdenDetails ordenDetDB= service.guardarOrdenDet(ordenDetails);
        return ResponseEntity.status(HttpStatus.CREATED).body(ordenDetDB);
    }
    @PutMapping("/putOrdenDet{id}")
    public ResponseEntity<?> editarE (@RequestBody OrdenDetails ordenDetails, @RequestParam Integer id){
        Optional<OrdenDetails> o = service.porIdOrdenDet(id);
        if(o.isPresent()){
            OrdenDetails ordenDetDB =o.get();
            ordenDetDB.setDetalleNombre(ordenDetDB.getDetalleNombre());
            ordenDetDB.setDetalleCantidad(ordenDetDB.getDetalleCantidad());
            ordenDetDB.setDetallePrecio(ordenDetDB.getDetallePrecio());
            return ResponseEntity.status(HttpStatus.CREATED).body(service.guardarOrdenDet(ordenDetDB));
        }
        else
            return ResponseEntity.notFound().build();
    }
    @DeleteMapping("/deleteOrdenDet/{id}")
    public  ResponseEntity<?> deletebyIdOrdenDet (@PathVariable int id){
        this.service.deletebyIdOrdenDet(id);
        return ResponseEntity.ok(Boolean.TRUE);
    }

}
