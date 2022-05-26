package br.com.serratec.biblioteca.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;


@Entity
@Table
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    private String tilulo;
    @Column(nullable = false)
    private String tipo;
    @Column(nullable = false)
    private String autor;
    @Column(nullable = false)
    private LocalDate dataPublicacao;

    public Livro() {
    }

    public Livro(UUID id, String tilulo, String tipo, String autor, LocalDate dataPublicacao) {
        this.id = id;
        this.tilulo = tilulo;
        this.tipo = tipo;
        this.autor = autor;
        this.dataPublicacao = dataPublicacao;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTilulo() {
        return tilulo;
    }

    public void setTilulo(String tilulo) {
        this.tilulo = tilulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(LocalDate dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }
}
