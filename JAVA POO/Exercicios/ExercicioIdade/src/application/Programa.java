package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CalcIdade;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		CalcIdade calcidade = new CalcIdade();
		
		System.out.print("Anos: ");
		calcidade.anos = sc.nextInt();
		System.out.print("Meses: ");
		calcidade.meses = sc.nextInt();
		System.out.print("Dias: ");
		calcidade.dias = sc.nextInt();
		
		System.out.println("Idade em dias : "+calcidade.idadeDias());
		
		sc.close();
	}

}
