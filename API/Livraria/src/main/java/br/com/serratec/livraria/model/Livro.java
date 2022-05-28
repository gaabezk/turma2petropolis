package br.com.serratec.livraria.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

import javax.persistence.*;

@Entity
@Table
public class Livro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idLivro;
	
	private String nomeLivro;

	@ManyToOne
	private Categoria categoriaLivro;
	@JsonIgnore
	@ManyToMany
	private List<Autor> autoresLivro;

	public Livro() {
	}
	public Livro(Integer idLivro, String nomeLivro, Categoria categoriaLivro, List<Autor> autoresLivro) {
		this.idLivro = idLivro;
		this.nomeLivro = nomeLivro;
		this.categoriaLivro = categoriaLivro;
		this.autoresLivro = autoresLivro;
	}
	public Integer getIdLivro() {
		return idLivro;
	}
	public void setIdLivro(Integer idLivro) {
		this.idLivro = idLivro;
	}
	public String getNomeLivro() {
		return nomeLivro;
	}
	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}
	public Categoria getCategoriaLivro() {
		return categoriaLivro;
	}
	public void setCategoriaLivro(Categoria categoriaLivro) {
		this.categoriaLivro = categoriaLivro;
	}
	public List<Autor> getAutoresLivro() {
		return autoresLivro;
	}
	public void setAutoresLivro(List<Autor> autoresLivro) {
		this.autoresLivro = autoresLivro;
	}
}
