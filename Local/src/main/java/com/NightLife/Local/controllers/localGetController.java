package com.NightLife.Local.controllers;

import com.NightLife.Local.Entity.Local;
import com.NightLife.Local.services.localServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/get")
@CrossOrigin(value="*")
public class localGetController {
    @Autowired
    private localServices services;
    @GetMapping("/listarLocal")
    public ResponseEntity<List<Local>> listar(){ return ResponseEntity.ok(services.listar());}
@GetMapping("/nombreLocal/{nombre}")
    public ResponseEntity<?> porNombre(@PathVariable String nombre){
        Optional<Local> o = services.porNombre(nombre);
        if(o.isPresent()){
            return ResponseEntity.ok(o.get());
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }
}
