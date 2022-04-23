package br.com.serratec.dominio;

import br.com.serratec.entidade.Policial;
import br.com.serratec.entidade.PolicialFederal;

public class PoliciaisMain {

	public static void main(String[] args) {
		
		Policial p1 = new Policial("Roberto","1251215");
		PolicialFederal pf1 = new PolicialFederal("Gilberto","15515","COPE");
		
		final String nomeSuspeito = "Irinel";
		// nao pode ser alterado
		// nomeSuspeito = "manel";
		
		final String nomeSuspeito2;
		nomeSuspeito2 = "Irinelson";
		// final pode ser declarado 
		// e só depois atribuida
		
		System.out.println("Suspeito 1: "+nomeSuspeito);
		System.out.println("Suspeito 2: "+nomeSuspeito2);
	}

}
