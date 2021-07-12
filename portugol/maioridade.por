programa
{
	//condicoens SE o usuario tiver mais de 18 anos, escreva: vc alcançou a maioridade
	funcao inicio()
	{
	    inteiro anoAtual
	    inteiro anoNascimento
	    inteiro idade
		escreva("em que anos estamos")
		leia(anoAtual)
		escreva("qual o ano do seu nascimento")
		leia(anoNascimento)
		idade= anoAtual-anoNascimento
		escreva("sua idade é:" , idade)
		se(idade>=18){
		escreva("Você é de maior!")	
		}
		senao{
			escreva("voce é de menor")
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 456; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */