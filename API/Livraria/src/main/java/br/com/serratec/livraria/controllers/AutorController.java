package br.com.serratec.livraria.controllers;

import br.com.serratec.livraria.model.Autor;
import br.com.serratec.livraria.services.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/autor")
public class AutorController {

    @Autowired
    AutorService autorService;

    @GetMapping
    public ResponseEntity<List<Autor>> getAll(){
        HttpHeaders headers = new HttpHeaders();
        headers.add("Lista de Autores", "Segue a lista de autores");
        return new ResponseEntity<List<Autor>>(autorService.listarTudo(),headers, HttpStatus.valueOf(202));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Autor> getById(@PathVariable Integer id){
        HttpHeaders headers = new HttpHeaders();
        headers.add("Autor escolhido", "Segue a o autor escolhido");
        return new ResponseEntity<Autor>(autorService.listarPorId(id),headers, HttpStatus.valueOf(202));
    }

    @PostMapping
    public ResponseEntity<Autor> insert(@RequestBody Autor autor){
        autorService.inserir(autor);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Inserir autor", "Insere um autor e retorna ele");
        return new ResponseEntity<>(autor,headers, HttpStatus.CREATED);
    }

    @PutMapping("/coe/{id}")
    public  ResponseEntity<Autor> update(@RequestBody Autor autor, @PathVariable Integer id){

        HttpHeaders variavelMudavel = new HttpHeaders();
        variavelMudavel.add("Alterar autor", "altera o nome de um autor e retorna ele");

        //return autorService.updateAutor(autor,id);

       return new ResponseEntity<Autor>(autorService.updateAutor(autor,id),variavelMudavel, HttpStatus.CREATED);
    }
}
