programa
{
	
	funcao inicio()
	{
			/*Fazer um programa para cálculo de valores de compra de imóveis de uma corretora
			Entrar com valor do imóvel
			Nome do Comprador
			Nome do Vendedor
			Calcular 
			O comprador paga além do valor do imóvel as seguintes taxas:
			Laudêmio - 2.5%
			ITBI - 3.5%
			Vendedor 
			O vendedor paga 5% de comissão para a corretora de imóveis
			No final deverão ser exibidos as seguintes informações:
			Total Geral Gasto pelo comprador (Valor do Imóvel + Taxas(ITBI e Laudêmio)
			Valor a receber pelo comprador(Valor do imóvel menos a comissão)*/
	
		real valorImovel,compraTotal,vendaTotal
		cadeia nomeComprador,nomeVendedor,continuar
		inteiro i = 1
		
		enquanto (i == 1){
			escreva("Digite o valor do imovel: ")
			leia(valorImovel)
			escreva("Digite o nome do comprador: ")
			leia(nomeComprador)
			escreva("Digite o nome do vendedor: ")
			leia(nomeVendedor)
	
			compraTotal = (valorImovel * 0.025) + (valorImovel * 0.035) + valorImovel
			vendaTotal = valorImovel * 0.05
	
			escreva("Total Geral Gasto pelo comprador: ", compraTotal, "\n")
			escreva(nomeVendedor," receberá de ",nomeComprador," R$", vendaTotal, "\n")
	
			escreva("Digite S para sair: ")
			leia(continuar)
			se(continuar == "s" ou continuar == "S"){
				i=2
		}	}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1281; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */