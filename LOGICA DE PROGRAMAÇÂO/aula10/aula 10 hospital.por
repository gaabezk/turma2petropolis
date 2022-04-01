programa
{
	inclua biblioteca Util --> u
	inclua biblioteca Texto --> t
	cadeia nome,telefone,email,especialidade
	real valorConsulta=0.0
	logico quartos[20]
	inteiro quarto=0
	
	funcao inicio()
	{
		logico continuar=verdadeiro
		inteiro opcao
		enquanto(continuar){
			escreva("-----------Sistema Hospitalar-----------")
			escreva("\n1-Consulta\n2-Internação\n3-Listar Quartos\n4-Sair do Programa\n")
			escreva("Digite uma opção: ")
			leia(opcao)
			limpa()

			escolha(opcao){
				caso 1: 	consulta()
						esperar()
				pare
				caso 2: 	internacao()
						esperar()
				pare
				caso 3: 	listarQuartos()
						esperar()
				pare
				caso 4: 	continuar = falso
				pare
				caso contrario: escreva("Opção Inválida !!")
				pare
				
			}

		}
		
	}

	funcao consulta(){
		preencherDados()
	}

	funcao internacao(){
		preencherDados()
		verificarNumeroQuarto()
		se(ocupacaoQuarto(quarto)){
			//quartos[quarto-1] = falso
			escreva("Quarto ocupado!")
		}senao{
			quartos[quarto-1] = verdadeiro
			escreva("Quarto disponivel para o paciente!")
		}
	}

	funcao logico ocupacaoQuarto(inteiro q){
		se(quartos[quarto-1]==verdadeiro){
			retorne verdadeiro
		}senao{
			retorne falso
		}
	}

	funcao verificarNumeroQuarto(){
		escreva("Digite o nº do quarto: ")
		leia(quarto)
		enquanto(quarto>20 ou quarto <= 0){
			escreva("Quarto inválido! Digite novamente!")
			leia(quarto)
		}
	}

	funcao listarQuartos(){
		escreva(" ------------------Lista de Quartos Disponiveis------------------\n")
		para(inteiro i=0; i < 20; i++){
			se(quartos[i]){
				escreva("|OCUPADO|",i+1,"\n")
			}senao{
				escreva("|DISPONIVEL|",i+1,"\n")
			}
		}
		escreva(" -----------------------------------------------------------------")
	}
	
	funcao esperar(){
		cadeia auxiliar
		u.aguarde(2000)
		escreva("\nPressione enter para continuar...")
		leia(auxiliar)
	}
	
	funcao preencherDados(){
		escreva("Digite o nome: ")
		leia(nome)
		escreva("Digite o telefone: ")
		leia(telefone)
		escreva("Digite o email: ")
		leia(email)
		escreva("Digite a especialização: ")
		leia(especialidade)
		se(especialidade == t.caixa_alta("Pediatra") ou especialidade == t.caixa_alta("Dentista")){
			valorConsulta = 150.00
		}senao{
			valorConsulta = 200.00
		}
	}

	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1748; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */