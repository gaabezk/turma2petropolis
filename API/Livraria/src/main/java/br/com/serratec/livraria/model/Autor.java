package br.com.serratec.livraria.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class Autor {
	@Id
	private Integer id;
	private String nome;
	
	@ManyToMany(mappedBy = "autores")
	private List<Livro> livros;
}
