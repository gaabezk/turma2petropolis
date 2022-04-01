programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{/*
		3 - Escreva um programa que armazene X números 
		em um vetor e calcule o valor médio do vetor.      */

		/*inteiro numeros[5] = {8,10,7,9,2},soma=0

		para(inteiro i=0; i <= 4; i++){
			soma = soma + numeros[i]
		}
		escreva("Soma dos numeros é: ",soma)*/

		real numeros[5],soma=0.0,media

		para(inteiro i=0; i <= 4; i++){
			escreva("Digite a ",i+1,"º ","nota do aluno: ")
			leia(numeros[i])
		}
		para(inteiro i=0; i <= 4; i++){
			soma = soma + numeros[i]
		}
		media = soma/5
		escreva("A média do aluno é: ",mat.arredondar(media,2),"\n")
		se(media >= 5){
			escreva("APROVADO!")
		}senao{
			escreva("REPROVADO!")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 674; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */