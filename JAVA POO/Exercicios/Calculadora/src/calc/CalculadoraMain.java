package calc;

import java.util.Locale;
import java.util.Scanner;

public class CalculadoraMain {

    public static void main(String[] args) {
    	
    	Locale.setDefault(Locale.US);
    	     
    	Scanner leitor = new Scanner(System.in);
        
        System.out.print("Insira o primeiro número: ");
        double numero1 = leitor.nextDouble();
        
        System.out.print("Insira o segundo número: ");
        double numero2 = leitor.nextDouble();
        
        System.out.print(
                "1 - Somar\n"
                + "2 - Subtrair\n"
                + "3 - Multiplicar\n"
                + "4 - Dividir\n"
                + "5 - Resto\n"
                + "0 - Sair\n"
                + "Insira a operação: "
            );
        int operacao = leitor.nextInt();
        
        Calculadora.calcular(numero1, numero2, operacao);
        leitor.close();
    }

}