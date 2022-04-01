programa
{
	
	funcao inicio()
	{
		//Ler nome e salario anual e no calcular o IR
		// se o  salario anual for menor 25000 nao paga imposto 
		//se o salario anual for maior ou a igual 25000 paga 15%
		// se o salario anual for maior maior ou igual 40000 paga 27.5%

		real salario,taxa
		
		escreva("Informe seu salario anual: ")
		leia(salario)

		se(salario >= 40000){
			escreva("Voce paga R$" + (salario*27.5)/100)
		}senao 
			se (salario <25000){
			  escreva("Voce nao paga imposto esse ano!")
			   }senao
				escreva("Voce paga R$" + (salario*15)/100 + " de imposto de renda.")		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 593; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */