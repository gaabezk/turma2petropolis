package com.serratec.autenticacaoapi.services;

import com.serratec.autenticacaoapi.models.Autor;
import com.serratec.autenticacaoapi.repositories.AutorRespositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AutorService {

    @Autowired
    AutorRespositorio repository;

    @Autowired
    BCryptPasswordEncoder bCrypt;

    public void create(Autor autor){
        autor.setSenha(bCrypt.encode(autor.getSenha()));
        repository.save(autor);
    }

    public Autor getAutor(String username){
        Optional<Autor> optional = repository.findByEmail(username);
        if (optional.isEmpty()){
            return null;
        }

    }

}
