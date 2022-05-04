package testes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArraylistTestes {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		List<String> frutas = new ArrayList<String>();
		
		System.out.print("Quantos itens deseja adicionar ao carrinho? ");
		int qtd = sc.nextInt();
		
		for (int i = 0; i < qtd; i++) {
			System.out.print("Nome do "+(i+1)+"º item: ");
			frutas.add(sc.next());
		}
		
		boolean b = frutas.contains("Manga");
		System.out.println("Contem Manga na lista? "+b);
		
		for (String listaF : frutas) {
			System.out.println(listaF);
		}
		
		
		
		
		
		sc.close();
	}

}
