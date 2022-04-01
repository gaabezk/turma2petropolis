programa
{
	
	funcao inicio()
	{

		cadeia nome
		real salario,vendas,comissao,valorComissao
			
		escreva("-----------------------------------------------------------\n")
		escreva("--------------SISTEMA DE GESTÃO DE VENDEDORES--------------\n")
		escreva("-----------------------------------------------------------\n\n")
		escreva(">>> Digite o nome do vendedor: ")
		leia(nome)
		escreva(">>> Digite o salário: ")
		leia(salario)
		escreva(">>> Informe o valor das suas vendas deste mês: ")
		leia(vendas)
		escreva(">>> Informe a comissão em percentual: ")
		leia(comissao)


		valorComissao = vendas * comissao/100
		
		escreva("\n\n-----------------RESUMO-----------------\n")
		escreva("--Nome: ",nome,"\n")
		escreva("--Salário Líquido: ",salario,"\n")
		escreva("--Valor comissaão: ",valorComissao,"\n")
		escreva("--Salário Final : ",salario+valorComissao,"\n")
		escreva("----------------------------------------")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 929; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */