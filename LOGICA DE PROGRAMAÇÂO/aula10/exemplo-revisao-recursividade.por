programa
{
	
	funcao inicio()
	{	
		inteiro numero
		escreva("Digite um número:")
		leia(numero)
		escreva("Resultado:", somarNumeros(numero) )
	}
	
	funcao inteiro somarNumeros(inteiro numero){
		inteiro resultado
		se(numero >=10){
			retorne 10
		}senao{
			escreva(numero,"\n")
			resultado = numero + somarNumeros(numero + 1)
			escreva(resultado)
			retorne resultado
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 105; 
 * @PONTOS-DE-PARADA = 7;
 * @SIMBOLOS-INSPECIONADOS = {numero, 12, 37, 6}-{resultado, 13, 10, 9};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */