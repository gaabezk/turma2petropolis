package application;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double horasTrab,salHora,horaSemanal,horasExtra,custo,salHoraExtra;
		
		System.out.print("Horas Trabalhadas por m�s: ");
		horasTrab = sc.nextDouble();
		System.out.print("Sal�rio por hora: ");
		salHora = sc.nextDouble();
		
		horaSemanal = horasTrab/4;
		
		if(horaSemanal <= 40) {
			custo = salHora * horaSemanal * 4;
			
		}else {
			horasExtra = (horaSemanal - 40) * 4;
			salHoraExtra = salHora*1.50;
			custo = (horasExtra*salHoraExtra) + ((salHora * 40) * 4);
			
			}
		System.out.printf("Custo : R$%.2f",custo);
		sc.close();
	}
}
