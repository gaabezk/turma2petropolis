package br.com.serratec.livraria.services;

import br.com.serratec.livraria.model.Autor;
import br.com.serratec.livraria.repositorio.AutorRepositorio;
import com.sun.xml.bind.v2.TODO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutorService {

    @Autowired
    AutorRepositorio repositorio;

    public List<Autor> listarTudo() {
        return repositorio.findAll();
    }

    public Autor listarPorId(Integer id){
        Optional<Autor> optional = repositorio.findById(id);
        if (optional.isEmpty()) {
            //TODO fazer exception
        }
        return optional.get();
    }

    public void inserir(Autor autor){
        repositorio.save(autor);
    }
     public Autor updateAutor(Autor autor, Integer id){
        Optional<Autor> optional = repositorio.findById(id);
        if(optional.isEmpty()){
            //TODO TRATAR EXCEÇÃO
        }
        Autor oldAutor = optional.get();

         if (oldAutor.getNomeAutor() != null) {
             oldAutor.setNomeAutor(autor.getNomeAutor());
         }
        return repositorio.save(oldAutor);
     }


}

