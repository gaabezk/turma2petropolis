package br.com.serratec.livraria.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Categoria {
	
	@OneToMany(mappedBy = "categoria")
	private List<Livro> livros; 
	
	@Id
	private Integer id;
	
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private String descricao;
	
	public Categoria() {
		super();
	}

	public Categoria(Integer id, String nome, String descricao) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
	}
	
	
	
	
}
