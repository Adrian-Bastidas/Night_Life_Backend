package com.NightLife.Locales.controllers;

import com.NightLife.Locales.Entity.Empleados;
import com.NightLife.Locales.Entity.Local;
import com.NightLife.Locales.Entity.Productos;
import com.NightLife.Locales.services.localServices;
import com.NightLife.Locales.services.productoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/postProducto")
@CrossOrigin(value="*")

public class productoQueryController {

    @Autowired
    private productoServices services;

    @PostMapping("/producto")
    public ResponseEntity<?> crearProducto(@RequestBody Productos producto){
        Productos localDB= services.guardarProducto(producto);
        return ResponseEntity.status(HttpStatus.CREATED).body(localDB);
    }
    @DeleteMapping ("/delete/{id}")
    public  ResponseEntity<?> deleteProducto (@PathVariable int id){
        this.services.deletebyIdProducto(id);
        return ResponseEntity.ok(Boolean.TRUE);
    }

}
