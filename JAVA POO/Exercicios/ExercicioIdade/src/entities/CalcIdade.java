package entities;

public class CalcIdade {
	
	public int anos,meses,dias;
	
	public int idadeDias() {
		
		dias = dias + anos * 365;
		dias = dias + meses * 30;
		
		return dias;
	}
	
}
