programa
{
	inclua biblioteca Matematica
	--> mat
	
	funcao inicio()
	{
		real nota[4], maior=0.0, menor=0.0, soma=0.0

        para(inteiro i=0; i < 4; i++){
            escreva("Digite a nota: ")
            leia(nota[i])
            enquanto (nota[i] < 0 ou nota[i] > 10){
                escreva("Nota inválida, digite novamente: ")
                leia(nota[i])
            }
            soma += nota[i]
            se(i==0){
                maior = nota[i]
                menor = nota[i]
            }
            se(nota[i] > maior){
                maior = nota[i]
            }
            se(nota[i] < menor){
                menor = nota[i]
            }
        }
        limpa()
        escreva("A média das notas é: ", mat.arredondar(soma/4,2), "\nA maior nota é: ", mat.arredondar(maior,2), "\nA menor nota é: ", mat.arredondar(menor,2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 262; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */