package application;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double num;
		
		System.out.println("Qual numero voce quer saber se � positivo ou negativo? ");
		num = sc.nextDouble();
		
		if (num >= 0 ) {
			System.out.println(num+" � positivo!");
		}else {
			System.out.println(num+" � negativo!");
		}
		
		sc.close();
	}

}
