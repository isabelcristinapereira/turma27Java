programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
	real d,a,b,c,r,s
		escreva("valor de a:")
		leia (a)
		escreva ( " valor de b: ")
		leia (b)
		escreva ( " valor de c: ")
		leia (c)
		r= Matematica.potencia ((a+b),2)
		s= Matematica.potencia ((b+c),2)

		d= (r+s)/2
		escreva ("valor de d " + d)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 315; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */