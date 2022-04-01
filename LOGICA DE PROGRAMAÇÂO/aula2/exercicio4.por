programa
{
	
	funcao inicio()
	{	
		inteiro num1,num2
		caracter operador
		escreva("Digite um numero: ")
		leia(num1)
		escreva("Digite o operador: ")
		leia(operador)
		escreva("Digite outro numero: ")
		leia(num2)

		escolha(operador){
			caso '+': escreva("Soma: ", num1 + num2)
			pare
			caso '-': escreva("Subtração: ", num1 - num2)
			pare
			caso '*': escreva("Multiplicação : ", num1 * num2)
			pare
			caso '/': escreva("Divisão: ", num1 / num2)
			pare
			caso contrario: escreva("Operação invalida!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 244; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */