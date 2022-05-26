package br.com.serratec.contasbancarias.controllers;

import br.com.serratec.contasbancarias.exception.ContaInvalidaException;
import br.com.serratec.contasbancarias.exception.OperacaoInvalidaException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionController {

    @ExceptionHandler(ContaInvalidaException.class)
    public ResponseEntity<?> contaInvalidaException(ContaInvalidaException e){
        HttpHeaders meuHeader = new HttpHeaders();
        meuHeader.add(e.m1(),e.m2());
        return new ResponseEntity<>(meuHeader, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(OperacaoInvalidaException.class)
    public ResponseEntity<?> operacaoInvalidaException(OperacaoInvalidaException e){
        HttpHeaders meuHeader = new HttpHeaders();
        meuHeader.add(e.m1(),e.m2());
        return new ResponseEntity<>(meuHeader, HttpStatus.BAD_REQUEST);
    }
}
