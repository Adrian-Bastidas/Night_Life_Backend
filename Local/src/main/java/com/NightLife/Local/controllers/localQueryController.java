package com.NightLife.Local.controllers;

import com.NightLife.Local.Entity.Local;
import com.NightLife.Local.services.localServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/post")
@CrossOrigin(value="*")
public class localQueryController {
    @Autowired
    private localServices services;
    @RequestMapping("/local")
    public ResponseEntity<?> crear(@RequestBody Local local){
        Local localDB= services.guardar(local);
        return ResponseEntity.status(HttpStatus.CREATED).body(localDB);
    }
}
