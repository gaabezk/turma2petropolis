package br.com.serratec.entities;


public class Musica {

	protected String nome;
	protected String cantor;
	protected String produtor;
	protected String duracao;
	
	public Musica(String nome, String cantor, String compositor, String duracao) {
		this.nome = nome;
		this.cantor = cantor;
		this.produtor = compositor;
		this.duracao = duracao;
	}

	@Override
	public String toString() {
		return 	"\nMusica: "
				+ nome
				+ "   Cantor: "
				+ cantor
				+ "   Produtor: "
				+ produtor
				+ "   Duracao: "
				+ duracao
				+ "\n";
	}
	
	
	
}
