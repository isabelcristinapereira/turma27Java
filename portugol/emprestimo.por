programa
{//emprestimo com juros de 20% e parcelar em 10 vezes
	
	funcao inicio()
	{ 
	real juros
	real emprestimo
	real parcela
		escreva("qual o valor do emprestimo")
		leia(emprestimo)
		juros= ((20*emprestimo)/100)
		escreva("o valor total com juros, será:" , juros)
		parcela=(emprestimo+juros)/10
		escreva("o valor de cada parcela será: ", parcela)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 368; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */