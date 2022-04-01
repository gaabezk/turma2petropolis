programa
{
	
	funcao inicio()
	{
		/*	4) 	Crie uma função que receba um número como 
				parâmetro e escreva a tabuada desse número.   */

		inteiro numero
		
		escreva("De qual numero vc deseja saber a tabuada: ")
		leia(numero)

		tabuada(numero)

	}
	funcao tabuada(inteiro num){
		para(inteiro i=0; i <= 9; i++){
			escreva( num,"x",i+1,": ",num*(i+1)," \n")

		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 359; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */