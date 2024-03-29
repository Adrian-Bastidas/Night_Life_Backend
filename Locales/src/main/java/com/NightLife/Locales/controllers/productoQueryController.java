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

import java.util.Optional;

@RestController
@RequestMapping("/actions")
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
    @PutMapping("/{id}")
    public ResponseEntity<Productos> actualizarProducto(@PathVariable Integer id, @RequestBody Productos productoActualizado) {
        Optional<Productos> o = services.porIdproducto(id);
        if(o.isPresent()){
            Productos productoExistente=o.get();
        // Actualiza los campos del producto existente con los valores del producto actualizado
        productoExistente.setProdFoto(productoActualizado.getProdFoto());
        productoExistente.setProdPrecioCompra(productoActualizado.getProdPrecioCompra());
        productoExistente.setProdPrecioVenta(productoActualizado.getProdPrecioVenta());
        productoExistente.setProdDescripcion(productoActualizado.getProdDescripcion());
        productoExistente.setLocal(productoActualizado.getLocal());

        // Guarda el producto actualizado en la base de datos
        Productos ProductoActualizado = services.guardarProducto(productoExistente);

        return ResponseEntity.ok(ProductoActualizado);
        }
        else
            return ResponseEntity.notFound().build();
    }
    }

