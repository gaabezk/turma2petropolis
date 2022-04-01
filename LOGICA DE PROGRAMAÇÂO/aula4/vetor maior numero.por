programa
{
	
	funcao inicio()
	{
		inteiro idade[5] ,maioridade=0, menoridade=0

		para(inteiro i=0; i <= 4; i++){
			escreva("Digite a idade:")
			leia (idade[i])
		}
		para(inteiro i=0; i <=4; i++){
			
			se(i==0){
				maioridade=idade[i]
				menoridade=idade[i]
		}
			senao se(idade[i]>maioridade){
				maioridade=idade[i]
			}
			 se(idade[i]<menoridade){
				menoridade=idade[i]
			}
		}

		escreva("Maior idade é:"+maioridade+ "\n" )
		escreva("Menor idade é:"+menoridade)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 447; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */