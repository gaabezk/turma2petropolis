programa
{
	
	funcao inicio()
	{
		real salario[5]

		para(inteiro i= 0; i < 5; i++){
			escreva("\nInforme o ",i+1,"º salário: ")
			leia(salario[i])

			se(salario[i] < 1500){
				salario[i] += salario[i] * 0.1
			}
		}
		escreva("\nLista de salários: ")
		para(inteiro i=0; i<5;i++){
			escreva("\n",i+1,"º salario é R$ ", salario[i])
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 342; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */