package com.serratec.autenticacaoapi.cointrollers;

import com.serratec.autenticacaoapi.models.Autor;
import com.serratec.autenticacaoapi.services.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutorController {

    @Autowired
    AutorService service;

    @GetMapping("/ola")
    public String digaOla(){
        return "Olá";
    }

    @PostMapping("/create")
    public void create(@RequestBody Autor autor){
        service.create(autor);
    }
}
