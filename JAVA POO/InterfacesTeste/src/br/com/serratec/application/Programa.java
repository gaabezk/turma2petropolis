package br.com.serratec.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		System.out.print("Enter rental data\nCar model: ");
		String carModel = sc.nextLine();
		System.out.print("Pickup (dd/MM/yyyy HH:mm:ss): ");
		String dataPickup = sc.nextLine();
		Date dataPickup1 = sdf2.parse(dataPickup);
		System.out.print("Return (dd/MM/yyyy HH:mm:ss): ");
		String dataReturn = sc.nextLine();
		Date dataReturn1 = sdf2.parse(dataReturn);
		
		System.out.println(dataPickup1);
		System.out.println(dataReturn1);
		System.out.println(carModel);
		
		System.out.println(dataReturn1.getHours() - dataPickup1.getHours());
		
		
		
		
		sc.close();
	}
}