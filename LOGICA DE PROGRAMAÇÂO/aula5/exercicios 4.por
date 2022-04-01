programa
{
	
	funcao inicio()
	{
		inteiro soma=0,maior,menor=0,matriz[4][3] = { {1,2,3},{4,5,6},{7,8,9},{10,11,12}}

		maior=matriz[0][0]
		menor=matriz[0][0]
		para(inteiro i=0; i < 4; i++){
			para(inteiro j=0; j < 3; j++){
				se(maior < matriz[i][j]){
				maior = matriz[i][j]
			}
				se(menor > matriz[i][j]){
				menor=matriz[i][j]
				}
			}
		}
		para(inteiro i=0; i < 4; i++){
			para(inteiro j=0; j < 3; j++){
			soma=soma+matriz[i][j]
			}
		}
		escreva("Nota maior: ",maior,"  Nota menor: ",menor)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 261; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */