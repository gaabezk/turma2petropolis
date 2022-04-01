programa
{
	
	funcao inicio()
	{
		inteiro nota1,nota2,falta,media
		
		escreva("Digite a nota1: ")
		leia(nota1)
		escreva("Digite a nota2: ")
		leia(nota2)

		escreva("Digite o numero de faltas: ")
		leia(falta)

		media = (nota1+nota2)/2
		
		se(media >= 7 e falta <10){
			escreva("usuario aprovado!!")
		}senao{
			escreva("usuario reprovado!!")
			}
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 311; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */