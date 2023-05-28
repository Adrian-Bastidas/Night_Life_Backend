package com.NightLife.Login.Controllers;

import com.NightLife.Login.Entity.Login;
import com.NightLife.Login.Services.LoginServices;
import org.apache.juli.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/QueryUsers")
@CrossOrigin(value="*")
public class QueryUsuaruioController {
    @Autowired
    private LoginServices services;
    @PostMapping("/Post")
    public ResponseEntity<?> crear(@RequestBody Login persona){

        Login newPersona=services.guardarUsu(persona);

        return ResponseEntity.status(HttpStatus.CREATED).body(newPersona);
    }
    @DeleteMapping("/delete/usuario/{id}")
    public ResponseEntity<?> eliminarAlternativaRespuesta(@PathVariable Integer id){
        Optional<Login> o=services.porId(id);
        if(o.isPresent()){
            services.deletebyId(o.get().getPerId());
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
    @PutMapping("/put/edit")
    public ResponseEntity<?> editar(@RequestBody Login persona){
        Optional<Login> o=services.porId(persona.getPerId());
        if(o.isPresent()){
            Login contenidoDb = persona;
            return ResponseEntity.status(HttpStatus.CREATED).body(services.guardarUsu(contenidoDb));
        }
        return ResponseEntity.notFound().build();
    }
}
