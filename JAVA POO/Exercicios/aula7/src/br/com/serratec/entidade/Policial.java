package br.com.serratec.entidade;

public class Policial {
	protected String nome;
	private String registro;
	
	public Policial(String nome, String registro) {
		this.nome = nome;
		this.registro = registro;
	}

	public final void registarPrisao(String suspeito) {
		System.out.println("O policial " 
							+ this.nome 
							+ " efetudou a prisao de "
							+suspeito);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}
	
	
}
