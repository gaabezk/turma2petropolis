package br.com.serratec.biblioteca.controllers;

import br.com.serratec.biblioteca.exception.LivroExistenteException;
import br.com.serratec.biblioteca.exception.LivroNotException;
import br.com.serratec.biblioteca.model.Livro;
import br.com.serratec.biblioteca.services.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/biblioteca")
public class LivroController {

    @Autowired
    LivroService service;
    @GetMapping
    public ResponseEntity<List<Livro>> getAll(){
        HttpHeaders headers = new HttpHeaders();
        headers.add("Lista de Livros", "Segue a lista de livros");
        return new ResponseEntity<List<Livro>>(service.listarTudo(),headers, HttpStatus.valueOf(202));
    }
    @GetMapping("/{numero}")
    public Livro getOne(@PathVariable UUID numero) throws LivroNotException {
        return service.listarConta(numero);
    }
    @PostMapping
    public ResponseEntity<?> insert(@RequestBody Livro livro) throws LivroNotException {
        service.inserir(livro);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Inserir livro", "Insere um livro e retorna ele");
        return new ResponseEntity<>(service.listarConta(livro.getId()),headers, HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public Livro update(@RequestBody Livro livro, @PathVariable UUID id) throws LivroExistenteException, LivroNotException {
        return service.atualizar(livro, id);
    }
}
