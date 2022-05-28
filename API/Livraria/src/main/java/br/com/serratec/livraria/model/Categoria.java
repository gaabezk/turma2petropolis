package br.com.serratec.livraria.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

import javax.persistence.*;

@Entity
@Table
public class Categoria {
	@JsonIgnore
	@OneToMany(mappedBy = "categoriaLivro")
	private List<Livro> livrosCategoria;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCategoria;
	
	@Column(nullable = false)
	private String nomeCategoria;
	@Column(nullable = false)
	private String descricaoCategoria;
	
	public Categoria() {
		super();
	}

	public Categoria(Integer idCategoria, String nomeCategoria, String descricaoCategoria) {
		super();
		this.idCategoria = idCategoria;
		this.nomeCategoria = nomeCategoria;
		this.descricaoCategoria = descricaoCategoria;
	}

	public List<Livro> getLivrosCategoria() {
		return livrosCategoria;
	}

	public void setLivrosCategoria(List<Livro> livrosCategoria) {
		this.livrosCategoria = livrosCategoria;
	}

	public Integer getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNomeCategoria() {
		return nomeCategoria;
	}

	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}

	public String getDescricaoCategoria() {
		return descricaoCategoria;
	}

	public void setDescricaoCategoria(String descricaoCategoria) {
		this.descricaoCategoria = descricaoCategoria;
	}
}
