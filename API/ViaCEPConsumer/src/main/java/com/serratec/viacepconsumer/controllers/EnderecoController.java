package com.serratec.viacepconsumer.controllers;

import com.serratec.viacepconsumer.model.Endereco;
import com.serratec.viacepconsumer.services.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {

    @Autowired
    EnderecoService enderecoService;

    @GetMapping
    public List<Endereco> getAll(){
        return enderecoService.findAll();
    }
    @GetMapping("/{id}")
    public Endereco getById(@PathVariable Integer id){
        return enderecoService.findById(id);
    }
    @PostMapping
    public Endereco create(@RequestBody Endereco endereco){
        return enderecoService.create(endereco);
    }

}
