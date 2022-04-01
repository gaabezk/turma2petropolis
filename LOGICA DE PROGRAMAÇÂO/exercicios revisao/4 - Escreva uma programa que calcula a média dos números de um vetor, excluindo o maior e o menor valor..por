programa
{
	
	funcao inicio()
	{	
	 /*    4 - Escreva uma programa que calcula a média dos números 
		        de um vetor, excluindo o maior e o menor valor.    */

		real v[6],maior,menor,media1,media2,soma=0,x=0

		para(inteiro i=0; i <= 5; i++){
			escreva("Informe o ",i+1,"º valor: ")
			leia(v[i])
		}

		maior=v[0]
		menor=v[0]
		para(inteiro i=0; i <= 5; i++){
			se(maior < v[i]){
				maior = v[i]
			}
			se(menor > v[i]){
				menor=v[i]
			}
		}
		para(inteiro i=0; i <= 5; i++){
			soma=soma+v[i]
		}
		media2=(soma-maior-menor)/(6-2)
		escreva("Nota maior: ",maior,"  Nota menor: ",menor,"\nMédia das outras quatro notas: ",media2)
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 308; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */