programa
{//verificar se o aluno foi aprovado ou reprovado
	
	funcao inicio()
	{
          real n1, n2,m=0

		escreva("digite sua primeira nota")
		leia(n1)
		escreva("digite sua segunda nota")
		leia(n2)
		m=(n1+n2)/2
		escreva("a media do aluno foi : ", m)
		se (m>=7){
			escreva("aluno aprovado")
		}
		se((m>=5) e (m<=7)) {
			escreva("aluno em recuperação.")
		}
		senao{
			escreva("aluno reprovado")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 422; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */