package entities;

public class Funcionario {
	
	public String nome;
	public double salarioBruto,taxa;
	
	public String toString() {
		return "Funcionario: "
				+nome
				+", $ "
				+String.format("%.2f",salarioLiquido());		
	}

	public double salarioLiquido() {
		return salarioBruto - taxa;
	}
	public void acrescentarSalario(double porcentagem) {
		salarioBruto = salarioBruto + porcentagem/100 * salarioBruto;
	}
	
}
