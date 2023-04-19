package com.NightLife.Locales.controllers;

import com.NightLife.Locales.Entity.Local;
import com.NightLife.Locales.services.localServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/post")
@CrossOrigin(value="*")
public class localQueryController {
    @Autowired
    private localServices services;
    @PostMapping("/local")
    public ResponseEntity<?> crear(@RequestBody Local local){
        Local localDB= services.guardar(local);
        return ResponseEntity.status(HttpStatus.CREATED).body(localDB);
    }
}
