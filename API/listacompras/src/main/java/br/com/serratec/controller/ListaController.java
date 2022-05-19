package br.com.serratec.controller;

import br.com.serratec.model.ListaCompras;
import br.com.serratec.service.ListaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lista")
public class ListaController {
    @Autowired
    ListaService service;


    @PostMapping
    public void inserir(@RequestBody ListaCompras lista){
        service.inserir(lista);
    }

    @GetMapping
    public List<ListaCompras> getLista(){
        return service.visualizar();
    }



}
