programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		cadeia nome,cargo
		caracter resposta = 's'
		real salarioBruto,valeTransporte,planoDeSaude,inss,calculoFaltas,calculoHorasExtras,calculoDependentes,calculoSalarioFamilia,valorVenda,calculoVenda
		
		inteiro numFaltas,horasExtras,numDependentes
		const real valorSalarioFamilia=56.47
//enquanto (caracter resposta = s ou S) o programa continua rodando infinitamente
//para parar basta atribuir outro caracter (diferente de s ou S)
//vc precisa colocar algo no final do codigo para perguntar se quer parar
	enquanto(resposta == 's' ou resposta == 'S'){
		escreva("Digite o nome: ")
		leia (nome)
		escreva("Digite o salário: ")
		leia(salarioBruto)
		escreva("Escreva o numero de faltas: ")
		leia(numFaltas)
		escreva("Digite o numero de horas extras: ")
		leia(horasExtras)
		escreva("Digite o numero de Dependentes: ")
		leia(numDependentes)
		escreva("Digite o cargo: ")
		leia(cargo)
		limpa()
		
		
		valeTransporte = salarioBruto * 0.06 // 6%
		planoDeSaude = salarioBruto *0.01 + 50 // 1% + 50
		inss = salarioBruto * 0.11 //11%
		calculoFaltas = salarioBruto/30 *numFaltas
		calculoHorasExtras = salarioBruto * 0.01 * horasExtras
		calculoSalarioFamilia = numDependentes * valorSalarioFamilia

		se(cargo == "vendedor"){
			escreva("Digite o valor da venda: ")
			leia(valorVenda)
			calculoVenda = valorVenda * 0.10
			escreva("\nSalário Líquido: ", 
			Matematica.arredondar(salarioBruto-valeTransporte-planoDeSaude-inss-calculoFaltas+calculoHorasExtras+calculoSalarioFamilia+calculoVenda,2))
		}senao{
			escreva("\nSalário Líquido: ", 
			Matematica.arredondar(salarioBruto-valeTransporte-planoDeSaude-inss-calculoFaltas+calculoHorasExtras+calculoSalarioFamilia,2))
		}
		escreva("\ndeseja continuar? \n R: Sim - R: Nao\n")
		leia(resposta)
	}	
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1820; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */