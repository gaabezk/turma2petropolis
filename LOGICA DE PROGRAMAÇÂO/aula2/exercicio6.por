programa
{
	
	funcao inicio()
	{
		inteiro idade
		cadeia nome,categoria
		
		escreva("Digite seu nome: ")
		leia(nome)
		
		escreva("Digite sua idade: ")
		leia(idade)

		se(idade <= 10){
			 escreva("Categoria : Escolhinha")
		}senao{
			se(idade <= 17){
				escreva("Categoria : de base")
			}senao{
				se(idade <= 40){
					escreva("Categoria : Profissional")
				}senao{
					se(idade >= 41){
						escreva("Categoria : Master")
					}
				}
			}	
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 382; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */