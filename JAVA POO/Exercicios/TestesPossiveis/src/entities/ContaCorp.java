package entities;

public class ContaCorp extends Conta{
	
	private double limiteEmprestimo;
	
	
	public ContaCorp() {
		
	}

	public ContaCorp(Integer numero, String titular, double saldo, double limiteEmprestimo) {
		super(numero, titular, saldo);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(double limiteCredito) {
		this.limiteEmprestimo = limiteCredito;
	}
	
	public void emprestimo(double quantidade) {
		if(quantidade <= limiteEmprestimo) {
			deposito(quantidade);			
		}
	}
}