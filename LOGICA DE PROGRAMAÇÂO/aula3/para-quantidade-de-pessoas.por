programa
{
	
	funcao inicio()
	{
		//Leia a idade de uma determinada quantidade de pessoas que também deverá ser informada 
		//pelo usuário e diga no final (quantos são) (de maior) e (de menor idade).

		inteiro idade,quantidade, totalMaior18=0,totalMenor18=0

		escreva("Digite a quantidade de pessoas: ")
		leia(quantidade)

		para(inteiro i=0; i < quantidade; i++){
			escreva("Digite a idade: ")
			leia(idade)
			se(idade >= 18){
				totalMaior18 = totalMaior18 +1
			}senao{
				totalMenor18 = totalMenor18 +1
			}
		}
			escreva("Maiores de 18: ", totalMaior18,"\n")
			escreva("Maiores de 18: ", totalMenor18,"\n")	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 534; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */