package com.NightLife.Locales.controllers;
import com.NightLife.Locales.Entity.Empleados;
import com.NightLife.Locales.Entity.Local;
import com.NightLife.Locales.services.empleadosServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/postEmpleados")
@CrossOrigin(value="*")
public class empleadosQueryController {

    @Autowired
    private empleadosServices services;
    @PostMapping("/empleados")
    public ResponseEntity<?> CrearEmpleado(@RequestBody Empleados empleados){
        Empleados localDB= services.guardarem(empleados);
        return ResponseEntity.status(HttpStatus.CREATED).body(localDB);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> editar (@RequestBody Empleados empleados, @PathVariable Integer id){
        Optional<Empleados> o = services.porId(id);
        if(o.isPresent()){
            Empleados empleadosDB =o.get();
            empleadosDB.setEmpAlias(empleados.getEmpAlias());
            empleadosDB.setEmpNombre(empleados.getEmpNombre());
            empleadosDB.setEmpHoraInicio(empleados.getEmpHoraInicio());
            empleadosDB.setEmpHoraFin(empleados.getEmpHoraFin());
            return ResponseEntity.status(HttpStatus.CREATED).body(services.guardarem(empleadosDB));
        }
        else
            return ResponseEntity.notFound().build();
    }
    @DeleteMapping ("/deleteEmpleados/{id}")
    public  ResponseEntity<?> EliminarEmpleado (@PathVariable int id){
        this.services.deletebyIdem(id);
        return ResponseEntity.ok(Boolean.TRUE);
    }
}
