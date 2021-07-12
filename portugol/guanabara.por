programa
{
	inclua biblioteca Matematica
	//leia tres lados de um triangulo e diga se ele é 
	//equilatero ou escaleno.
	
	funcao inicio()
	{                                     //triangulo equilatero tem tres lados iguais
	                                      //escaleno tem tres lados diferentes
	                                      //eles tem que ser totalmente iguais entre si
	                                      //ou totalmente diferente entre si.
		real l1, l2, l3
		cadeia equilatero, escaleno
		
		escreva ("digite o valor do primeiro lado")
		leia(l1)
		escreva ("digite o valor do segundo lado")
		leia(l2)
		escreva ("digite o valor do terceiro lado")
		leia(l3)
		equilatero= (l1==l2 e l1==l3)
		//escaleno l1 diferente de l2, l2 diferente de l3, l1 diferente de l3
	
	
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 787; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */