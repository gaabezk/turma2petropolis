package br.com.serratec.application;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.serratec.entities.Musica;
import br.com.serratec.entities.PlayList;
import br.com.serratec.entities.Video;

public class Program {
	
	static Scanner sc = new Scanner(System.in);
	static List<Musica> listaMusicas = new ArrayList();
	static List<Video> listaVideos = new ArrayList();
	static PlayList listaMusic;
	
	
	public static void main(String[] args){

		boolean continuar = true;
		do {
		continuar = menu();

		}while(continuar);
		System.out.println("\nLISTA DE MUSICAS CADASTRADAS NO SISTEMA\n"+listaMusicas);
		System.out.println("\nLISTA DE VIDEOS CADASTRADAS NO SISTEMA\n"+listaVideos);
		
	}
	
	public static void cadastrarVideo() {
			
		
			System.out.println("\n\n=========== Cadastre um Video ===========");
			System.out.print("Nome do Video: ");
			String nomeVideo = sc.nextLine();
			System.out.print("Assunto: ");
			String assunto = sc.nextLine();
			System.out.print("Canal: ");
			String canal = sc.nextLine();
			System.out.print("Visualizações: ");
			int visualizacao = sc.nextInt();
			System.out.print("Duracao: ");
			String duracao = sc.next();
			System.out.println("===========================================");
			
			listaVideos.add(new Video(nomeVideo, assunto, canal, visualizacao, duracao));
			
		}
	
	public static void cadastrarMusica() {
		
		
		System.out.println("\n\n=========== Cadastre uma Musica ===========");
		System.out.print("Nome da Musica: ");
		String nomeMusica = sc.nextLine();
		System.out.print("Cantor: ");
		String nomeCantor = sc.nextLine();
		System.out.print("Produtor: ");
		String nomeProdutor = sc.nextLine();
		System.out.print("Duração: ");
		String duracao = sc.next();
		System.out.println("===========================================");
		
		listaMusicas.add(new Musica(nomeMusica, nomeCantor, nomeProdutor, duracao));
		
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
		case 2:
			cadastrarVideo();
			break;
		case 0:
			return false;
		}
		
		return true;
		
	}
	
}
