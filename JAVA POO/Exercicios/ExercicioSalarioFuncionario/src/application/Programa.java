package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Funcionario;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.print("Nome: ");
		funcionario.nome = sc.nextLine();
		System.out.print("Salário Bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		System.out.print("Taxa: ");
		funcionario.taxa = sc.nextDouble();
		
		System.out.println(funcionario);
		
		
		System.out.print("Qual a porcentagem de acrescimo do salario? ");
		double porcentagem = sc.nextDouble();
		funcionario.acrescentarSalario(porcentagem);
		
		System.out.println("Dados Alterados: "+funcionario);
		sc.close();
	}

}
