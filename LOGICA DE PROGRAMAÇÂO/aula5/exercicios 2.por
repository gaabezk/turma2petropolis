programa
{
	
	funcao inicio()
	{
		inteiro novo,x=0,numero, matriz[4][2] = {	{1,2},
										{3,4},
										{5,6},
										{7,8}	}
		
		enquanto(x != 8){
			escreva("qual numero voce quer encontrar: ")
			leia(numero)
			para(inteiro i=0; i < 4; i++){
				para(inteiro j=0; j < 2; j++){
					se(matriz[i][j] == numero){
						escreva("Numero encontrado, digite um numero para substituir: ")
						leia(novo)
						matriz[i][j] = novo
						x=8
					}
				}
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 453; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */