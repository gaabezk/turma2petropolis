programa
{
	
	funcao inicio()
	{	
	/*   Escreva um programa que leia 10 números inteiros do 
		teclado e armazena no vetor. Após isso, imprima os 
		10 inteiros em ordem inversa ao que foi digitado.    */

		inteiro numeros[10]
		escreva("Digite 10 numeros: ")
		para(inteiro i=0; i <= 9; i++){
			leia(numeros[i])
			limpa()
		}
		para(inteiro i=9; i >= 0; i--){
			escreva(numeros[i],"  ")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 363; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {numeros, 10, 10, 7}-{i, 16, 15, 1}-{i, 16, 15, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */