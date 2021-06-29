programa
{
	
	funcao inicio()
	{
		real idadeDias
      real meses , anos , dias
	
	escreva ( "qual a sua idade? ")
	leia (anos)
	escreva ("qual a sua idade expressa em meses?")
	leia (meses)
	escreva ("qual a sua idade expressa em dias? ")
	leia (dias)
	idadeDias = 365 * anos + 30 * meses + dias
	escreva ("sua idade em dias é: " , 365 * anos + 30 * meses + dias)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 377; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */