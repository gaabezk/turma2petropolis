programa
{

inclua biblioteca Matematica --> mat
    funcao inicio()
    {
        cadeia produto, categoria
        inteiro i = 1
        real preco, quantidade, total = 0.00, calculoICMS = 0.00

        enquanto (i == 1){
            escreva("Nome do produto: ")
            leia(produto)
            escreva("Quantidade: ")
            leia(quantidade)
            escreva("Valor unitário: ")
            leia(preco)
            escreva("Entre com a categoria: ")
            leia(categoria)

            total += (preco * quantidade) // total = total + (...)

            se (categoria == "Alimentos" ou categoria == "alimentos"){
                calculoICMS =     calculoICMS + (total * 0.07)
            }senao se(categoria == "Bebidas" ou categoria == "bebidas"){
                    calculoICMS = calculoICMS + (total * 0.15)
                    }senao{
                        calculoICMS = calculoICMS + (total * 0.09)
                    }
            escreva("Deseja adicionar mais algum produto?\n1 - Sim \n2 - Não\n")
            leia(i)
            limpa()
        }

        escreva("O total da sua compra foi de: ", mat.arredondar(total,2), " reais")
        escreva("\nTotal ICMS: ", mat.arredondar(calculoICMS,2))

    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1241; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */