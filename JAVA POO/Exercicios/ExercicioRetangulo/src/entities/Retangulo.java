package entities;

public class Retangulo {
	
	public double altura,largura;
	
	public double area() {
		return altura * largura;
	}
	public double perimetro() {
		return ( altura + largura ) * 2;
	}
	public double diagonal() {
		return Math.sqrt( altura * altura + largura * largura );
	}
}
