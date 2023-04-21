package com.NightLife.Ordenes.controllers;

import com.NightLife.Ordenes.Entity.OrdenDetails;
import com.NightLife.Ordenes.services.OrdenDetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/getOrdenDet")
@CrossOrigin(value="*")
public class OrdenDetGetController {
    @Autowired
    private OrdenDetService service;
    @GetMapping("/listarOrden")
    public ResponseEntity<List<OrdenDetails>> listarOrdenDet() {
        return ResponseEntity.ok(service.listarOrdenDet());
    }
    @GetMapping("/{id}")
    public ResponseEntity<OrdenDetails> porIdOrdenDet(@PathVariable Integer id) {
        Optional<OrdenDetails> o = service.porIdOrdenDet(id);
        if (o.isPresent()){
            return  ResponseEntity.ok(o.get());
        }
        return ResponseEntity.notFound().build();
    }
}
