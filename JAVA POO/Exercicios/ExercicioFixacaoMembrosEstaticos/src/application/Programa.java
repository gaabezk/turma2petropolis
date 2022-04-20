package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Cotacao;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Qual o preço do dollar atual: ");
		double dollarPrice = sc.nextDouble();
		System.out.print("Quantos dolares voce vai comprar: ");
		double dollarQuantity = sc.nextDouble();
		
		System.out.println(String.format("Pagamento em reais: %.2f", Cotacao.dollarToReal(dollarPrice, dollarQuantity)));
		
		sc.close();
		

	}

}
