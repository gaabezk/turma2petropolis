programa
{
	
	funcao inicio()
	{
		cadeia nome
		inteiro numeroParcelas
		real valorCompra, totalPagar=0.0
		
		escreva("Nome:")
		leia(nome)
		escreva("Parcelas:")
		leia(numeroParcelas)
		escreva("Valor Compra:")
		leia(valorCompra)
		calculaParcelas(numeroParcelas, valorCompra, totalPagar)
		escreva("Total a Pagar:",totalPagar)
	}
	
	funcao calculaParcelas(inteiro numeroParcelas, real valorCompra, real &totalPagar){
		para(inteiro i=0; i < numeroParcelas; i++){
			se(i==0){
			totalPagar=valorCompra/numeroParcelas
			}senao{
			 totalPagar = totalPagar + valorCompra * 1.10	
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 340; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */