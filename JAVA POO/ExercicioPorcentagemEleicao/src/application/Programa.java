package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Percentual;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Percentual percentual = new Percentual();
		
		
		System.out.print("Eleitores: ");
		percentual.eleitores = sc.nextDouble();
		System.out.print("Votos brancos: ");
		percentual.votoBranco = sc.nextDouble();
		System.out.print("Votos nulos: ");
		percentual.votoNulo = sc.nextDouble();
		System.out.print("Votos válidos: ");
		percentual.votoValido = sc.nextDouble();

		percentual.calculo();
		
		System.out.println(String.format("Percentual de votos em branco = %.2f",percentual.votoBranco)+"%");
		System.out.println(String.format("Percentual de votos nulos = %.2f",percentual.votoNulo)+"%");
		System.out.println(String.format("Percentual de votos válidos = %.2f",percentual.votoValido)+"%");
		
		sc.close();
	}

}
