package br.com.serratec.application;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.serratec.entities.Musica;
import br.com.serratec.entities.PlayList;

public class Program {
	
	static Scanner sc = new Scanner(System.in);
	static List<Musica> listaMusicas = new ArrayList();
	static PlayList listaMusic;
	
	
	public static void main(String[] args){

		boolean continuar = true;
		do {
		continuar = menu();

		}while(continuar);
		System.out.println(listaMusic.getMusica());
		
	}
	
	public static void cadastrarMusica() {
			
		
			System.out.println("\n\n=========== Cadastre uma musica ===========");
			System.out.print("Nome da musica: ");
			String nomeMusica = sc.nextLine();
			System.out.print("Cantor: ");
			String nomeCantor = sc.nextLine();
			System.out.print("Produtor: ");
			String nomeProdutor = sc.nextLine();
			System.out.print("Duração: ");
			String duracao = sc.next();
			System.out.println("===========================================");
			
			listaMusic = new PlayList(new Musica(nomeMusica,nomeCantor,nomeProdutor,duracao));
			
		}
	
	public static boolean menu() {
		
		System.out.print(		"1- Cadastar Musica\n"
							+	"2- Cadastrar Video\n"
							+ 	"3- Criar PlayList\n"
							+ 	"4- Remover Musica\n"
							+ 	"5- Remover Video\n"
							+ 	"0- Sair\n"
							+	"Escolha uma opção: ");
		
		
		int escolha = sc.nextInt();
		sc.nextLine();

		switch(escolha) {
		case 1:
			cadastrarMusica();
			break;
		case 0:
			return false;
		}
		
		return true;
		
	}
	
}
