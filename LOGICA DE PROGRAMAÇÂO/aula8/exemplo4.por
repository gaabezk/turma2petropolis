programa
{
	
	funcao inicio()
	{
		//fazer um programa para somar dois numeros e calcular a media
		//em uma funcao

		real num1,num2,resultado
		escreva("Numero1:")
		leia(num1)
		escreva("Numero2:")
		leia(num2)

		resultado = calcMed(num1, num2)
		escreva(resultado)
		escreva("\n",num1,"-",num2)
		
		
	}

	funcao real calcMed(real &n1, real &n2){
		n1=10
		n2=9
		retorne (n1+n2)/2
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 204; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */