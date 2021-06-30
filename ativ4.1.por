programa
{
	//Faça um programa que crie um vetor 
	//por leitura com 5 valores de pontuação de 
	//uma atividade e o escreva em seguida. Encontre 
	//após a maior pontuação e a apresente. 

	funcao inicio()
	{ 
	  inteiro pontAtividade[5]
	  inteiro maiorNumero= 0
	  para(inteiro i=0; i >=4; i++ ){
	  	
	  	escreva("digite a pontuação da atividade")
		leia(pontAtividade[i])
		se (maiorNumero < pontAtividade[i]) {
		maiorNumero= pontAtividade [i]
	      }
	  }
	
	escreva ("o maior numero digitado é:",maiorNumero) 
       }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 462; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */