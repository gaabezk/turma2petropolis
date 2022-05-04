package br.com.serratec.interfaces;

public interface Emprestimo {
	boolean pedirEmprestimo(double valor);
	
	static void verSaldoDisponivelNoBanco() {
		System.out.println("O saldo disponivel é R$ 2.000.000,00");
	}
}
