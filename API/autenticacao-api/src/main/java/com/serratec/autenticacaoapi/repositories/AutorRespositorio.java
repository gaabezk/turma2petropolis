package com.serratec.autenticacaoapi.repositories;

import com.serratec.autenticacaoapi.models.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AutorRespositorio extends JpaRepository<Autor,Integer> {
    Optional<Autor> findByEmail(String email);
}
