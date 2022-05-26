package br.com.serratec.biblioteca.services;

import br.com.serratec.biblioteca.exception.LivroExistenteException;
import br.com.serratec.biblioteca.exception.LivroNotException;
import br.com.serratec.biblioteca.model.Livro;
import br.com.serratec.biblioteca.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Service
public class LivroService {

    @Autowired
    LivroRepository repository;
    private String teste = "Livro não existe";
    public List<Livro> listarTudo() {
        return repository.findAll();
    }

    public Livro listarConta(UUID id) throws LivroNotException {
        Optional<Livro> optional = repository.findById(id);
        if (optional.isEmpty()) {
            throw new LivroNotException(teste);
        }
        return optional.get();
    }

    public void inserir(Livro livro){
        repository.save(livro);
    }

    public Livro atualizar(Livro livro, UUID id) throws LivroExistenteException, LivroNotException {
        Optional<Livro> optional = repository.findById(id);
        if (optional.isEmpty()) {
            throw new LivroNotException(teste);
        }
        Livro oldLivro = optional.get();

        if (oldLivro.getAutor() != null) {
            livro.setAutor(livro.getAutor());
        }

        if (oldLivro.getTilulo() != null) {
            livro.setTilulo(livro.getTilulo());
        }

        if (oldLivro.getTipo() != null) {
            livro.setTipo(livro.getTipo());
        }



        return repository.save(livro);

    }

}
