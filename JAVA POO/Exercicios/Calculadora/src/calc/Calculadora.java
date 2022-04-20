package calc;

public class Calculadora {
    public static double somar (double n1, double n2) {
        return n1 + n2;
    }
    
    public static double subtrair (double n1, double n2) {
        return n1 - n2;
    }
    
    public static double multiplicar (double n1, double n2) {
        return n1 * n2;
    }
    
    public static double dividir (double n1, double n2) {
        return n1 / n2;
    }
    
    public static double calcularResto (double n1, double n2) {
        return n1 % n2;
    }
    
    
    public static void calcular(double n1, double n2, int operacao) {
        switch (operacao) {
            case 1:
                System.out.println("O resultado da soma de " + n1 + " + " + n2 + " �: " + somar(n1,n2));
                break;
            case 2:
                System.out.println("O resultado da subtra��o de " + n1 + " - " + n2 + " �: " + subtrair(n1,n2));
                break;
            case 3:
                System.out.println("O resultado da multiplica��o de " + n1 + " * " + n2 + " �: " + multiplicar(n1,n2));
                break;
            case 4:
                System.out.println("O resultado da divis�o de " + n1 + " / " + n2 + " �: " + dividir(n1,n2));
                break;
            case 5:
                System.out.println("O resultado do resto da divis�o de " + n1 + "% " + n2 + " �: " + calcularResto(n1,n2));
                break;
            default:
                System.out.println("Op��o inv�lida");
                break;
        }
    }
}