programa
{
	
	funcao inicio()
	{
		/*Faça um programa que leia duas notas
		Crie uma função para calcular a média
		Criar uma funcao para verificar a situação
 		se a media >=7 Aprovado */

 		real nota1=0.0,nota2=0.0
 		escreva("Digite duas notas: ")
 		leia(nota1,nota2)
 		media(nota1,nota2)
 		escreva("Média: ",media(nota1,nota2))

 		se(situacao(media(nota1,nota2))==verdadeiro){
 			escreva("\nAprovado")
 		}senao{
 			escreva("\nReprovado")
 		}
	}

	funcao real media(real a,real b){
		retorne (a+b)/2
		}
	funcao logico situacao(real m){
		se(m >= 7){
			retorne verdadeiro
		}senao{
			retorne falso
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 443; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */