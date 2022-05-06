package br.com.serratec.entities;

import java.util.Date;

public class Video {

	protected String nome;
	protected String assunto;
	protected String nomeCanal;
	protected Integer numVisu;
	protected String duracao;
	
	public Video(String nome, String assunto, String nomeCanal, Integer numVisu, String duracao) {
		this.nome = nome;
		this.assunto = assunto;
		this.nomeCanal = nomeCanal;
		this.numVisu = numVisu;
		this.duracao = duracao;
	}

	@Override
	public String toString() {
		return 		"\nVideo: "
					+ nome
					+ "   Assunto: "
					+ assunto
					+ "   Canal: "
					+ nomeCanal
					+ "   Visualizações: "
					+ numVisu
					+ "   Duracao: "
					+ duracao
					+ "\n";
	}
	
	
	
}
