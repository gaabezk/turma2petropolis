package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

			System.out.print("Nome do Produto: ");
			String nome = sc.nextLine();
			System.out.print("Preço do Produto: ");
			double preco = sc.nextDouble();
			System.out.print("Quantidade do Produto: ");
			int quantidade = sc.nextInt();
			
			Product prod1 = new Product(nome,preco,quantidade);
			
			System.out.println(prod1);
		
		
		sc.close();

	}

}
