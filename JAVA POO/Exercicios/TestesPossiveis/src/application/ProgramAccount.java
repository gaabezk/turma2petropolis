package application;

import entities.Conta;
import entities.ContaCorp;

public class ProgramAccount {

	public static void main(String[] args) {
	
		ContaCorp mec = new ContaCorp();
		Conta mec1 = new Conta(123,"Gabriel",50000.00);


		System.out.println(mec.getTitular());
		System.out.println(mec1.getTitular());
		
		
		
	}

}
