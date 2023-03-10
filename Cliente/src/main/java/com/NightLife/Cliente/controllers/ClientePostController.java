package com.NightLife.Cliente.controllers;

import com.NightLife.Cliente.Entity.Cliente;
import com.NightLife.Cliente.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/actions")
@CrossOrigin("*")
public class ClientePostController {
    @Autowired
    private ClienteService servicio;
    @PostMapping("/postCliente")
    public ResponseEntity<?> crear(@RequestBody Cliente cliente){
        Cliente clienteDB= servicio.guardar(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteDB);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> editar (@RequestBody Cliente cliente, @RequestParam Integer id){
        Optional<Cliente> o = servicio.porId(id);
        if(o.isPresent()){
            Cliente clienteDB =o.get();
            clienteDB.setCliAlias(cliente.getCliAlias());
            clienteDB.setCliTelefono(cliente.getCliTelefono());
            return ResponseEntity.status(HttpStatus.CREATED).body(servicio.guardar(clienteDB));
        }
        else
            return ResponseEntity.notFound().build();
    }
}
