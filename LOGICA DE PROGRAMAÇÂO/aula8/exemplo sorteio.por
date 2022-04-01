programa
{
	inclua biblioteca Util --> u
	
	funcao inicio()
	{
		inteiro num,x,y

		escreva("Numero Inicial: ")
		leia(x)
		escreva("Numero Final: ")
		leia(y)
		
		num = u.sorteia(x,y)

		escreva("Numero Sorteado: ",num)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 225; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */