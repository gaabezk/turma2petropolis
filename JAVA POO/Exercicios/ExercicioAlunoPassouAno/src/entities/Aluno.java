package entities;

import java.util.Scanner;

public class Aluno {
	
	Scanner sc = new Scanner(System.in);
	double m[][] = new double[1][3];
	public String nome;
	public double nota;
	
	public double notaFinal() {
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("Digite a "+(j+1)+"º nota do aluno: ");
				m[i][j] = sc.nextDouble();
				nota += m[i][j];
			}
		}
		return nota;
	}
	public double notaFaltando() {
		if (nota < 60) {
			return 60 - nota;
		}else return 0.0;
	}
}