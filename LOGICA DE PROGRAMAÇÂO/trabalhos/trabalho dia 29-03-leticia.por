//Desenvolva um algoritmo para gerenciamento de vagas de estacionamento.
//O estacionamento possui trinta vagas. Deverá ser criado um menu com as seguintes opções:
//---------------------
//1-Entrada de Veículo
//2-Saída de Veículo
//3-Listar vagas
//4-Sair do programa
//--------------------

//Entrada
//Deverá ser digitado o número da vaga, uma crítica deverá ser feita para saber se o número da vaga
//está de 1 a 30 em caso afirmativo, verifique se esta vaga está liberada para estacionar preenchendo
//a posição do vetor.

programa
{
		inteiro valor, numeroVaga, vagas[30] //Valor, numeroVagas e vagas sao variaveis tipo inteiro. O colchetes com o numero 30 indica o tamanho do variavel vagas.
	
	funcao inicio() //Inicia o programa.
	{ //Aqui abre a função inicio.
	
		linhaTracejada() //Esse comando chama a funçao linhaTracejada definida mais abaixo no codigo.
		escreva("\n1-Entrada de veículo\n2-Saída de veículo\n3-Listar vagas\n4-Sair do programa\n") //Essa linha escreve no console o que esta dentro do parenteses.O "\n" que esta no parenteses pula uma linha no console.
		linhaTracejada() //Esse comando chama a funçao linhaTracejada definida mais abaixo no codigo.
		
		escreva("\nDigite a opção desejada: ") //Essa linha escreve no console o que esta dentro do parenteses.O "\n" que esta no parenteses pula uma linha no console.
		leia(valor) //A função leia pede para o usuario digitar no console e guarda o que foi digitado na variavel indicada entre parenteses,neste caso a variavel é valor.
		escolha(valor) { //A função escolha vai vereificar o valor que foi digitado no leia e vai direcionar para o caso especifico referente a ele.
			caso 1: //O comando caso 1,verifica se o numero 1 foi digitado,se sim ele executa os comandos abaixo até encontrar o comando pare.
				limpa() //O comando limpa,limpa todas as informações que estiverem acima dessa função,no console.
				verificaVagaEntrada() //Esse comando chama a funçao verificaVagaEntrada definida mais abaixo no codigo.
			pare //Esse comando encerra o caso 1.
			caso 2: //O comando caso 2,verifica se o numero 2 foi digitado,se sim ele executa os comandos abaixo até encontrar o comando pare.
				limpa() //O comando limpa,limpa todas as informações que estiverem acima dessa função,no console.
				verificaVagaSaida() //Esse comando chama a funçao verificaVagaSaida definida mais abaixo no codigo.
			pare //Esse comando encerra o caso 2.
			caso 3: //O comando caso 3,verifica se o numero 3 foi digitado,se sim ele executa os comandos abaixo até encontrar o comando pare.
				limpa() //O comando limpa,limpa todas as informações que estiverem acima dessa função,no console.
				listaVagas() //Esse comando chama a funçao listaVagas definida mais abaixo no codigo.
				inicio() //Essa função vai retornar para o inicio do programa.
			pare //Esse comando encerra o caso 3.
			caso 4: //O comando caso 4,verifica se o numero 4 foi digitado,se sim ele executa os comandos abaixo até encontrar o comando pare.
				limpa() //O comando limpa,limpa todas as informações que estiverem acima dessa função,no console.
				escreva("Obrigada por utilizar nosso sistema!\n") //Essa linha escreve no console o que esta dentro do parenteses.O "\n" que esta no parenteses pula uma linha no console.
			pare //Esse comando encerra o caso 4.
			caso contrario: //O comando caso contrario,verifica se o numero digitado nao corresponde a nenhum dos casos anteriores,se sim ele executa os comandos abaixo até encontrar o comando pare.
				limpa() //O comando limpa,limpa todas as informações que estiverem acima dessa função,no console.
				escreva("Opção inválida. Tente novamente!\n") //Essa linha escreve no console o que esta dentro do parenteses.O "\n" que esta no parenteses pula uma linha no console.
				inicio() //Essa função vai retornar para o inicio do programa.
		} //Essa chaves fecha a função escolha.
	} //Essa chaves fecha a função inicio.
	
	funcao linhaTracejada() { //Essa função foi criada para imprimir uma linha tracejada.
		para(inteiro i = 0; i <= 22; i++) { //Verifica se o valor esta compreendido entre a condição inicial e final. Nesse para, se a variavel i for igual a 0 e menor ou igual a 22, entra na função. A cada vez que retornar a variavel i acrescenta uma unidade.
			escreva("-") //Essa linha escreve no console o que esta dentro do parenteses.
		} //Essa chaves fecha a função para.
	} //Essa chaves fecha a função linhaTracejada.

	funcao verificaVagaEntrada() { //Essa função foi criada para verificar se o numero da vaga esta liberada.
        escreva("Digite o número da vaga: ") //Essa linha escreve no console o que esta dentro do parenteses.
        leia(numeroVaga) //Essa linha escreve no console o que esta dentro do parenteses.//A função leia pede para o usuario digitar no console e guarda o que foi digitado na variavel indicada entre parenteses,neste caso a variavel é numeroVaga.
        se(numeroVaga >= 1 e numeroVaga <= 30) {  //Verifica se o numero da vaga esta entre 1 e 30.
            se(vagas[numeroVaga - 1] == 0) { //Em caso afirmativo, realiza uma nova verificação onde se a posição do vetor for igual a 1 a vaga esta liberada
                escreva("A vaga ", numeroVaga, " está liberada! Vamos ocupar...\n") //Essa linha escreve no console o que esta dentro do parenteses.O "\n" que esta no parenteses pula uma linha no console. As informações que se encontram fora das aspas se referem as vareavies .
                entrada() //Esse comando chama a funçao entrada definida mais abaixo no codigo.
            } senao { //Caso a posição no vetor da vaga seja diferente de zero a vaga esta ocupada.
                escreva("A vaga já está ocupada!\n") //Essa linha escreve no console o que esta dentro do parenteses.
                verificaVagaEntrada() //Esse comando chama a funçao verificaVagaEntrada definida mais abaixo no codigo.
            }
        } senao {//Caso o numero da vaga seja menor que 1 ou maior que 30, a vaga não existe.
            escreva("Vaga inexistente!\n") //Essa linha escreve no console o que esta dentro do parenteses.O "\n" que esta no parenteses pula uma linha no console.
            inicio() //Essa função vai retornar para o inicio do programa.
        }
    }

    funcao verificaVagaSaida() { //Essa função foi criada para verificar se o numero da vaga esta ocupada.
        escreva("Digite o número da vaga: ") //Essa linha escreve no console o que esta dentro do parenteses.
        leia(numeroVaga) //Essa linha escreve no console o que esta dentro do parenteses.//A função leia pede para o usuario digitar no console e guarda o que foi digitado na variavel indicada entre parenteses,neste caso a variavel é numeroVaga.
        se(numeroVaga >= 1 e numeroVaga <= 30) { //Verifica se o numero da vaga esta entre 1 e 30.
            se(vagas[numeroVaga - 1] == 1) { //Em caso afirmativo, realiza uma nova verificação onde se a posição do vetor for igual a 1 a vaga esta liberada
                escreva("A vaga ", numeroVaga, " está ocupada! Vamos liberar...\n") //Essa linha escreve no console o que esta dentro do parenteses.
                saida() //Esse comando chama a funçao saida definida mais abaixo no codigo.
            } senao { //Caso a posição no vetor da vaga seja diferente de zero a vaga esta ocupada.
                escreva("A vaga já está liberada!\n") //Essa linha escreve no console o que esta dentro do parenteses.
                verificaVagaSaida() //Esse comando chama a funçao verificaVagaSaida definida mais abaixo no codigo.
            }
        } senao { //Caso o numero da vaga seja menor que 1 ou maior que 30, a vaga não existe.
            escreva("Vaga inexistente!") //Essa linha escreve no console o que esta dentro do parenteses.
            inicio() //Essa função vai retornar para o inicio do programa.
        }
    }

	funcao entrada() { //Essa função foi criada para informar que a vaga esta ocupada.
		vagas[numeroVaga - 1] = 1 //Atribui o valor 1 na posição do vetor indicado pelo numero da vaga solicitado.
		escreva("A vaga ", numeroVaga, " está ocupada!\n") //Essa linha escreve no console o que esta dentro do parenteses.O "\n" que esta no parenteses pula uma linha no console.As informações que se encontram fora das aspas se referem as vareavies .
		inicio() //Essa função vai retornar para o inicio do programa.
	} //Essa chaves fecha a função entrada.

	funcao saida() { //Essa função foi criada para informar que a vaga foi liberada.
		vagas[numeroVaga - 1] = 0 //Atribui o valor 0 na posição do vetor indicado pelo numero da vaga solicitado.
		escreva("A vaga ", numeroVaga, " está liberada!\n") //Essa linha escreve no console o que esta dentro do parenteses.O "\n" que esta no parenteses pula uma linha no console.As informações que se encontram fora das aspas se referem as vareavies .
		inicio() //Essa função vai retornar para o inicio do programa.
	} //Essa chaves fecha a função saida.

	funcao listaVagas() { //Essa função foi criada para vizualizar as vagas do estacionamento.
		para(inteiro i = 0; i < 30; i++) { //Verifica se o valor esta compreendido entre a condição inicial e final. Nesse para, se a variavel i for igual a 0 e menor que 30, entra na função. A cada vez que retornar a variavel i acrescenta uma unidade.
			escreva(vagas[i], " ") //Essa linha escreve no console o que esta dentro do parenteses.O "\n" que esta no parenteses pula uma linha no console.As informações que se encontram fora das aspas se referem as vareavies .
		} //Essa chaves fecha a função para.
		escreva("\n") //O "\n" que esta no parenteses pula uma linha no console.
	} //Essa chaves fecha a função listaVagas.
	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 4459; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vagas, 17, 29, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */