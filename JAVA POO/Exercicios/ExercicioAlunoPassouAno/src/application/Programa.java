package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.printf("Pontos Final: %.2f%n", aluno.notaFinal());
		
		if (aluno.nota < 60) {
			System.out.println("REPROVADO!");
			System.out.printf("PONTOS FALTANDO: %.2f%n", aluno.notaFaltando());
		}else {
			System.out.println("APROVADO!");
		}
		
		sc.close();
	}

}
