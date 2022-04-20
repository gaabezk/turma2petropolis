package br.com.serratec.versao2comgetset.entidade;

public class Cachorro2 {
	
	public String nome;
    public int idade;
    public String raca;
    
    public void latir() {
        System.out.println("O cachorro " + nome + " latiu" );
    }
    
    public void fazerAniversario() {
        this.idade += 1;
	
    }
}
