programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{	
/*    5 - Criar um algoritmo que leia em um vetor o nome, a quantidade e 
		o valor de uma lista de três produtos. Ao final deverá calcular o
		subtotal de cada produto e no final exibir o total geral da compra      */
		
		cadeia nome[3]
		real quantidade[3],valor[3],total=0

		para(inteiro i=0; i < 3; i++){
			escreva("Nome ",i+1,"º produto: ")
			leia(nome[i])
			escreva("Valor unitario ",i+1,"º produto: ")
			leia(valor[i])
			escreva("Quantidade ",i+1,"º produto: ")
			leia(quantidade[i])

			limpa()	
			total = total + quantidade[i]*valor[i]
		}
		escreva("Subtotal: ")
		para(inteiro i=0; i < 3; i++){
			escreva(nome[i],": ",mat.arredondar(quantidade[i]*valor[i],2),"    ")
			
		}
		escreva("\nTotal: ",mat.arredondar(total,2))
		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 761; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */