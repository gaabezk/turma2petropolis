package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	/*		fazer um programa para ler um numero inteiro N e a altura 
		 * 	de N pessoas. Armazene as N alturas em um vetor. Em seguida
		 *  mostrar a altura media dessas pessoas.		*/
		
		System.out.println("Digite o numero de pessoas para calcular a altura: ");
		int n = sc.nextInt();
		double media=0.0;
		
		double[] pessoas = new double[n];
		 
		for (int i = 0; i < n; i++) {
			System.out.printf("Digite a "+(i+1)+"º altura: ");
			pessoas[i] = sc.nextDouble();
			media = media + pessoas[i];
		}
	
		System.out.printf("Media das alturas: %.2f",media/n);
		
		sc.close();
	}
}
