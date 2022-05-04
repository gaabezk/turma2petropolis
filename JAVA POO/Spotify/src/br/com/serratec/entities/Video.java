package br.com.serratec.entities;

import java.util.Date;

public class Video {

	protected String nome;
	protected String assunto;
	protected String nomeCanal;
	protected Integer numVisu;
	protected Date duracao;
	
	public Video(String nome, String assunto, String nomeCanal, Integer numVisu, Date duracao) {
		this.nome = nome;
		this.assunto = assunto;
		this.nomeCanal = nomeCanal;
		this.numVisu = numVisu;
		this.duracao = duracao;
	}
	
	
	
}
