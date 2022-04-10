package application;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		int macas;
		double valor,total;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas maças gostaria de comprar? ");
		macas = sc.nextInt();
		
		if(macas >=12) {
			valor = 1.00;

		}else {
			valor = 1.30;
		}
		
		total = valor * macas;
		System.out.println("Total: "+total);
		sc.close();	
	}

}
