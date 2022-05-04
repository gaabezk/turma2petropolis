package application;

import java.util.Date;
import java.util.Scanner;

import entities.Order;
import entities.enums.OrderStatus;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

				
		OrderStatus os1 = OrderStatus.ENVIADO;
		
		String status = sc.next();
		
		OrderStatus os2 = OrderStatus.valueOf(status);
		
		
		
		System.out.println(os2);

				
	
		
		
		sc.close();
	}

}
