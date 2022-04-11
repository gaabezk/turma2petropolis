package application;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String time1,time2;
		int gols1,gols2;
		
		System.out.print("Nome do time: ");
		time1 = sc.next();
		System.out.print(time1+" fez quantos gols: ");
		gols1 = sc.nextInt();
		
		System.out.print("Nome do time: ");
		time2 = sc.next();
		System.out.print(time2+" fez quantos gols: ");
		gols2 = sc.nextInt();
		
		if(gols1 > gols2) {
			System.out.println("Vencedor: "+time1);
		}else if(gols1 < gols2){
			System.out.println("Vencedor: "+time2);
		}else {
			System.out.println("EMPATE!");
		}
		
		
		sc.close();
	}

}
