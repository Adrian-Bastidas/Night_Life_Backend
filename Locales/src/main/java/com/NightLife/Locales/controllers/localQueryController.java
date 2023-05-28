package com.NightLife.Locales.controllers;

import com.NightLife.Locales.Entity.Empleados;
import com.NightLife.Locales.Entity.Local;
import com.NightLife.Locales.services.localServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/postLocal")
@CrossOrigin(value="*")
public class localQueryController {
    @Autowired
    private localServices services;
    @PostMapping("/local")
    public ResponseEntity<?> crear(@RequestBody Local local){
        Local localDB= services.guardar(local);
        return ResponseEntity.status(HttpStatus.CREATED).body(localDB);
    }
    @DeleteMapping ("/delete/{id}")
    public  ResponseEntity<?> deleteUser (@PathVariable int id){
        this.services.deletebyId(id);
        return ResponseEntity.ok(Boolean.TRUE);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Local> actualizarLocal(@PathVariable Integer id, @RequestBody Local localActualizado) {
        Optional<Local> o = services.porId(id);
        if(o.isPresent()){
            Local localExistente=o.get();
        // Actualiza los campos del local existente con los valores del local actualizado
        localExistente.setLocNombre(localActualizado.getLocNombre());
        localExistente.setLocFoto(localActualizado.getLocFoto());
        localExistente.setLocHoraApertura(localActualizado.getLocHoraApertura());
        localExistente.setLocHoraCierre(localActualizado.getLocHoraCierre());
        localExistente.setLocDescripcion(localActualizado.getLocDescripcion());
        localExistente.setLocCoordenadas(localActualizado.getLocCoordenadas());
        localExistente.setLocPrecioFicha(localActualizado.getLocPrecioFicha());
        localExistente.setLocPrecioEntrada(localActualizado.getLocPrecioEntrada());
        localExistente.setLocPrecioPrivado(localActualizado.getLocPrecioPrivado());

        // Guarda el local actualizado en la base de datos
        Local LocalActualizado = services.guardar(localExistente);

        return ResponseEntity.ok(LocalActualizado);
        }
        else
            return ResponseEntity.notFound().build();
    }
    }