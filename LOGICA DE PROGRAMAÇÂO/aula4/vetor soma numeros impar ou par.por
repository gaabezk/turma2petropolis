programa
{
	
	funcao inicio()
	{
		/*Faça um algoritmo com um vetor com 8 numeros 
		inteiros. Exiba a soma de todos os números e também 
		quantidade de números pares e ímpares?*/

		inteiro numeros[8],soma=0,qtdeImpar=0,qtdePar=0
		para(inteiro i=0; i <= 7; i++){
			escreva("Digite os 8 numeros:")
			leia(numeros[i])
			soma = soma+numeros[i]
			se(numeros[i] % 2 == 0){
				qtdePar++
			}senao{
				qtdeImpar = qtdeImpar+1
			}
		}
		escreva("A soma dos numeros é: ",soma,"\n")
		escreva("Par: ",qtdePar," Impar: ",qtdeImpar)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 366; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */