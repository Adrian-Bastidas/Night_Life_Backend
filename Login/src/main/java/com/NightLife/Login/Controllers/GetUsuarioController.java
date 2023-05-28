package com.NightLife.Login.Controllers;

import com.NightLife.Login.Entity.Login;
import com.NightLife.Login.Services.LoginServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/getLogin")
@CrossOrigin(value="*")
public class GetUsuarioController {
    @Autowired
    private LoginServices services;
    @GetMapping("/listarUsuarios")
    public ResponseEntity<List<Login>> listarUsuarios(){ return ResponseEntity.ok(services.listarUsuarios());}
    @GetMapping("/{id}")
    public ResponseEntity<Login> porId(@PathVariable Integer id) {
        Optional<Login> o = services.porId(id);
        if (o.isPresent()){
            return  ResponseEntity.ok(o.get());
        }
        return ResponseEntity.notFound().build();
    }
    @GetMapping("/Login/{correo}/{contrasena}")
    public ResponseEntity<Login> porCorreoYContrasena(@RequestParam String correo, @RequestParam String contrasena) {
        Optional<Login> o = services.porCorreoyContrasena(correo, contrasena);
        if (o.isPresent()){
            return  ResponseEntity.ok(o.get());
        }
        System.out.println("Hola1");
        return ResponseEntity.notFound().build();
    }
}
