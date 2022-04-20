package entities;

public class Cotacao {
	
	public static double calcIOF(double valorDollar, double quantidadeDollar) {
		return valorDollar * 0.06 * quantidadeDollar;
	}
	
	public static double dollarToReal(double valorDollar, double quantidadeDollar) {
		return valorDollar * quantidadeDollar + Cotacao.calcIOF(valorDollar, quantidadeDollar);
	}
	
}
