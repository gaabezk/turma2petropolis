programa
{
	
	funcao inicio()
	{
		cadeia time,atleta[6]
		escreva("Nome do time: ")
		leia(time)   //ou i< 6
		para(inteiro i=0; i<=5; i++){
			escreva("Atleta: ")
			leia(atleta[i])
		}
		limpa()
	/*	para(inteiro i=0; i<6; i++){
			escreva(atleta[i]," ")
		}
	*/
		escreva("O primeiro atleta é: ", atleta[0])
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 313; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */