package com.NightLife.Locales.controllers;


import com.NightLife.Locales.Entity.Empleados;
import com.NightLife.Locales.Entity.Local;
import com.NightLife.Locales.Entity.Productos;
import com.NightLife.Locales.services.empleadosServices;
import com.NightLife.Locales.services.productoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/getProductos")
@CrossOrigin(value="*")
public class productoGetController {
    @Autowired
    private productoServices services;
    @GetMapping("/listarProductos")
    public ResponseEntity<List<Productos>> listarProducto(){ return ResponseEntity.ok(services.listarProducto());}

    @GetMapping("/{id}")
    public ResponseEntity<Productos> porIdproducto (@PathVariable Integer id) {
        Optional<Productos> o = services.porIdproducto(id);
        if (o.isPresent()){
            return  ResponseEntity.ok(o.get());
        }
        return ResponseEntity.notFound().build();
    }
    @GetMapping("/listarProductos/Local/{Local}")
    public ResponseEntity<List<Productos>> listarProductoPorLocal(@PathVariable Integer Local){ return ResponseEntity.ok(services.listarPorLocal(Local));}
}
