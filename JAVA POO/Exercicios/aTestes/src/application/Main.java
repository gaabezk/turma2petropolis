package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x1,x2,x3;
		double y1,y2,y3;
		double p;
		
		System.out.println("Entre com as medidas do triangulo X: ");
		x1 = sc.nextDouble();
		x2 = sc.nextDouble();
		x3 = sc.nextDouble();
		System.out.println("Entre com as medidas do triangulo Y: ");
		y1 = sc.nextDouble();
		y2 = sc.nextDouble();
		y3 = sc.nextDouble();
		
		p = (x1+x2+x3)/2.0;
		double areaX = Math.sqrt(p*(p-x1)*(p-x2)*(p-x3));
		
		p = (y1+y2+y3)/2.0;
		double areaY = Math.sqrt(p*(p-y1)*(p-y2)*(p-y3));
		
		System.out.printf("Area Triangulo X: %.4f",areaX);
		System.out.printf("\nArea Triangulo Y: %.4f",areaY);
		
		if(areaX > areaY) {
			System.out.println("\nMaior area: X");
		}else {
			System.out.println("\nMaior area: Y");
		}
		
		sc.close();
	}

}
