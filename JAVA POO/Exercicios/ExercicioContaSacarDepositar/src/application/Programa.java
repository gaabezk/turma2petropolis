package application;

import java.util.Scanner;

import entities.Conta;

public class Programa {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.titular = "Lucas";
        conta1.numero = 12345.6;
        
        Scanner leitor = new Scanner(System.in);
        lidarComDeposito(conta1, leitor);
        
        lidarComSaque(conta1, leitor);
        
        lidarComDeposito(conta1, leitor);
    }
    
    public static void lidarComDeposito(Conta conta, Scanner leitor) {
        System.out.print("Insira o valor de dep?sito: ");
        double valorInserido = leitor.nextDouble();
        conta.depositar(valorInserido);
        conta.imprimirSaldo();
    }
    
    public static void lidarComSaque(Conta conta, Scanner leitor) {
        System.out.print("Insira o valor de saque: ");
        double valorInserido = leitor.nextDouble();
        boolean conseguiuSacar = conta.sacar(valorInserido);
        if (conseguiuSacar) {
            System.out.println("Saque realizado com sucesso");
            conta.imprimirSaldo();
        }
        else {
            System.out.println("Saque n?o realizado. Saldo insuficiente");
            conta.imprimirSaldo();
        }
    }
}