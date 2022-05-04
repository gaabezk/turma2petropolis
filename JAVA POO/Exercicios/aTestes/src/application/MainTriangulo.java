package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;

public class MainTriangulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangulo x = new Triangulo();
		Triangulo y = new Triangulo();
		
		System.out.println("Entre com as medidas do triangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Entre com as medidas do triangulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX =  x.triangulo(x.a, x.b, x.c);
		double areaY =  y.triangulo(y.a, y.b, y.c);
		
		System.out.printf("Area Triangulo X: %.4f", areaX);
		System.out.printf("\nArea Triangulo Y: %.4f", areaY);
		
		if(areaX > areaY) {
			System.out.println("\nMaior area: X");
		}else {
			System.out.println("\nMaior area: Y");
		}
		sc.close();
	}

}
