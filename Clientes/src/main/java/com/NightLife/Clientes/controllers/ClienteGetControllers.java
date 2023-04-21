package com.NightLife.Clientes.controllers;

import com.NightLife.Clientes.Entity.Cliente;
import com.NightLife.Clientes.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/get")
@CrossOrigin(value="*")
public class ClienteGetControllers {
    @Autowired
    private ClienteService servicio;
    @GetMapping("/listarClientes")
    public ResponseEntity<List<Cliente>> listar() {
        return ResponseEntity.ok(servicio.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> porId(@PathVariable Integer id) {
        Optional<Cliente> o = servicio.porId(id);
        if (o.isPresent()){
            return  ResponseEntity.ok(o.get());
        }
        return ResponseEntity.notFound().build();
    }
}
