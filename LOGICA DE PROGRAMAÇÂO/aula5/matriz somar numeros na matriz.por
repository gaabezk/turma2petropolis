programa
{
	
	funcao inicio()
	{
		inteiro matriz[4][3],soma=0,total=0
		//linha
		para(inteiro i=0; i<4; i++){
			soma=0
			para(inteiro j=0; j<3; j++){
				escreva("Digite os números: ")
				leia(matriz[i][j])
				soma = soma+matriz[i][j]
				total= total + matriz[i][j]
			}
			escreva("Soma: ",soma,"\n")
		}
		escreva("Total: ",total)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 351; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 6, 10, 6}-{soma, 6, 23, 4}-{i, 8, 15, 1}-{j, 10, 16, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */