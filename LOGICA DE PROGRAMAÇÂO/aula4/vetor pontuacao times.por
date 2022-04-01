programa
{
	
	funcao inicio()
	{
		cadeia time[3],campeao="", ultimoColocado=""
		real pontuacao[3], maiorPontuacao=0.0,menorPontuacao=1000.0

		para(inteiro i=0; i<=2; i++){
			escreva("O nome do time: ")
			leia(time[i])

			escreva("Pontuação: ")
			leia(pontuacao[i])

			se(pontuacao[i] >maiorPontuacao){
				maiorPontuacao = pontuacao[i]
				campeao = time[i]
			}
			se(pontuacao[i] < menorPontuacao){
				menorPontuacao = pontuacao[i]
				ultimoColocado = time[i]
			}
		}
		escreva("Campeão: ",campeao,"  -  Maior Pontuação: ",maiorPontuacao,"\n")
		escreva("Ultimo: ",ultimoColocado,"  -  Menor Pontuação: ",menorPontuacao,"\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 485; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */