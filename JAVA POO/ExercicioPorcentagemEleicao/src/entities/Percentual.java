package entities;

public class Percentual {
	
	public double eleitores,votoBranco,votoNulo,votoValido;
	
	public void calculo() {
		votoNulo = (votoNulo * 100)/eleitores;
		votoBranco = (votoBranco *100)/eleitores;
		votoValido = (votoValido *100)/eleitores;
	}
	
}
