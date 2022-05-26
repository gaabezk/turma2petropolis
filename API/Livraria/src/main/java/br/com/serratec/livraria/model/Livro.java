package br.com.serratec.livraria.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Livro {
	
	@Id
	private Integer id;
	
	private String nome;
	
	@ManyToOne
	private Categoria categoria;
	
	@ManyToMany
	private List<Autor> autores;
	
	
}
