package application;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double horasTrab,salHora,horaSemanal,horasExtra,custo,salHora1;
		
		System.out.print("Horas Trabalhadas por mês: ");
		horasTrab = sc.nextDouble();
		System.out.print("Salário por hora: ");
		salHora = sc.nextDouble();
		
		salHora1 = salHora;
		horaSemanal = horasTrab/4;
		
		if(horaSemanal <= 40) {
			custo = salHora * horaSemanal * 4;
			
		}else {
			horasExtra = (horaSemanal - 40) * 4;
			salHora = salHora*1.50;
			custo = (horasExtra*salHora) + ((salHora1 * 40) * 4);
			
			}
		System.out.println(custo);
		sc.close();
	}
}
