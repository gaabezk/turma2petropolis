package entities;

public class Triangulo {

	public double a;
	public double b;
	public double c;
	
	public double triangulo(double a ,double b, double c) {
		double p = (a+b+c)/2.0;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
}
