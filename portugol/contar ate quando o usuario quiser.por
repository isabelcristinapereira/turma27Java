programa
{//laço enquanto contar até onde o usuario quiser
//nesse caso ele diz o numero e diz quanto o contador deve saltar..
	
	funcao inicio()
	{
		inteiro valor
		inteiro contador=0
		inteiro salto=0
		escreva("quer contar até quando?")
		leia(valor)
		escreva("quer saltar até quando?")
		leia(salto)
		enquanto(contador<=valor){
		
			escreva(contador)
			contador=contador+salto
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 128; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */