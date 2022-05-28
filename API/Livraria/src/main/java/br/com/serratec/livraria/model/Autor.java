package br.com.serratec.livraria.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

import javax.persistence.*;

@Entity
@Table
public class Autor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idAutor;
	private String nomeAutor;

	@ManyToMany(mappedBy = "autoresLivro")
	private List<Livro> livrosAutor;

	public Autor() {
	}

	public Autor(Integer idAutor, String nomeAutor, List<Livro> livrosAutor) {
		this.idAutor = idAutor;
		this.nomeAutor = nomeAutor;
		this.livrosAutor = livrosAutor;
	}

	public Integer getIdAutor() {
		return idAutor;
	}

	public void setIdAutor(Integer idAutor) {
		this.idAutor = idAutor;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}

	public List<Livro> getLivrosAutor() {
		return livrosAutor;
	}

	public void setLivrosAutor(List<Livro> livrosAutor) {
		this.livrosAutor = livrosAutor;
	}
}
