package com.NightLife.Cliente.controllers;

import com.NightLife.Cliente.Entity.Cliente;
import com.NightLife.Cliente.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/get")
@CrossOrigin(value="*")
public class ClienteGetController {
@Autowired
    private ClienteService servicio;
@GetMapping("/")
public ResponseEntity<List<Cliente>> listar(){
    return ResponseEntity.ok(servicio.listar());
}
}
