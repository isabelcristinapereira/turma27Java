programa
{
	
	funcao inicio()
	{
	real base,altura,area
		escreva("qual o valor da base do triângulo?")
		leia(base)
		escreva("qual o valor da altura do triângulo?")
		leia(altura)
		se(base>0 e altura>0){
		area=(base*altura)/2
		escreva("a área do triângulo é:",area)	
		}
		senao {
			escreva("os números não são válidos")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 43; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */