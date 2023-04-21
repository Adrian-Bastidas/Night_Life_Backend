package com.NightLife.Locales.controllers;

import com.NightLife.Locales.Entity.Local;
import com.NightLife.Locales.services.localServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/getLocal")
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
    @GetMapping("/{id}")
    public ResponseEntity<Local> porId(@PathVariable Integer id) {
        Optional<Local> o = services.porId(id);
        if (o.isPresent()){
            return  ResponseEntity.ok(o.get());
        }
        return ResponseEntity.notFound().build();
    }
}
