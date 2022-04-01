programa
{
	
cadeia user,pass, matriz[5][2] = {	{"ana","aninha"},
								{"joao","joao123"},
								{"calos","carlin321"},
								{"amanda","amand@"},
								{"lucia","lu00"}	}
	funcao inicio()
	{
/*		1) Criar um matriz 5x2 do tipo cadeia onde deverá ser inicializada com usuários e senhas.  
		  Na função inicio o usuário deverá ler um usuário e senha.********Deverá ser criada uma função
		 para buscar na matriz se este usuário e senha foram encontrados e retornar se achou ou não**********
		 este usuário, caso o usuário for encontrado escreva uma mensagem "Bem ao sistema"             */

		

		escreva("Digite seu usuario: ")
		leia(user)
		escreva("Digite sua senha: ")
		leia(pass)

		escreva(busca(user,pass))
		 
	}

	funcao cadeia busca(cadeia usuario, cadeia senha){
		para(inteiro i=0; i <= 4; i++){
				se(matriz[i][0] == usuario e matriz[i][1] == senha){
					retorne "Bem vindo ao sistema"
					
			}
		}retorne "Usuario ou senha invalido!"
	}
	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 875; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 4, 18, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */