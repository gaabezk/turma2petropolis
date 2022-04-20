package br.com.serratec.versao2comgetset.dominio;

import br.com.serratec.versao1.entidade.Cachorro;

public class CachorroMain2 {

    public static void main(String[] args) {
        Cachorro tobi = new Cachorro();
        tobi.nome = "Tobi";
        tobi.idade = 4;
        tobi.raca = "SRD";
        
        tobi.latir();
        
        tobi.fazerAniversario();
        
        System.out.println("A idade do " + tobi.nome + " é " + tobi.idade);
        
        

    }

}