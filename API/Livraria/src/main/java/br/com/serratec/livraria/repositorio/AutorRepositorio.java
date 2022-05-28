package br.com.serratec.livraria.repositorio;

import br.com.serratec.livraria.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepositorio extends JpaRepository<Autor,Integer> {
}
