package br.com.serratec.entidade;

import java.time.LocalDate;

// PolicialFederal nao pode ser usado como super classe ou classe mae
public final class PolicialFederal extends Policial {
	private String unidade;

	public PolicialFederal(String nome, String registro, String unidade) {
		super(nome, registro);
		this.unidade = unidade;
	}

/*	public void registarPrisao(String suspeito) {
		System.out.println("O policial " 
							+ this.nome 
							+ " efetudou a prisao de "
							+suspeito);   
	}
 */	
	
	public void registarPrisao(String suspeito, LocalDate dataPrisao) {
		System.out.println("O policial " 
							+ this.nome 
							+ " efetudou a prisao de "
							+suspeito + " na data " + dataPrisao);
	}
	
	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
}