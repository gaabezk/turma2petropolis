package application;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		double xa,xb,xc,delta,raizDelta,x1,x2;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A: ");
		xa = sc.nextDouble();
		System.out.print("B: ");
		xb = sc.nextDouble();
		System.out.print("C: ");
		xc = sc.nextDouble();
		
		delta = xb*xb - 4*xa*xc;
		raizDelta = Math.sqrt(xb*xb - 4*xa*xc);

		if(delta > 0) {
			
			x1 = (-(xb) + raizDelta) / (2*xa);
			x2 = (-(xb) - raizDelta) / (2*xa);
			
			System.out.println("S = {"+x1+","+x2+"}");
			
		}else if (delta == 0){
			
			x1 = (-(xb) / (2*xa));

			System.out.println("S = {"+x1+"}");
			
		}else {
			System.out.println("Impossível calcular");
		}
		
		sc.close();
	}

}
