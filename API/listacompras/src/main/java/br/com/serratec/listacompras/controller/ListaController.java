package br.com.serratec.listacompras.controller;

import br.com.serratec.listacompras.model.ListaCompras;
import br.com.serratec.listacompras.service.ListaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ListaController {
    @Autowired
    ListaService service;


    @PostMapping("/inserir")
    public void inserir(@RequestBody ListaCompras lista){
        service.inserir(lista);
    }

    @GetMapping("/visualizar")
    public List<ListaCompras> getLista(){
        return service.visualizar();
    }

    @DeleteMapping("/apagar")
    public void deletar(@RequestBody int id){
        service.deletar(id);
    }


}
