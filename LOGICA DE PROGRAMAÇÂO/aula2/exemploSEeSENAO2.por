programa
{
	
	funcao inicio()
	{
		inteiro idade
		real altura
		cadeia time
		
		escreva("Entre com a idade: ")
		leia(idade)

		escreva("Entre com a altura: ")
		leia(altura)

		escreva("Nome do time: ")
		leia(time)

		se((idade >= 18 ou altura >= 1.80) e time == "flamengo") {
			escreva("Candidato qualificado!")
		}senao{
			escreva("Candidato nao qualificado!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 327; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */