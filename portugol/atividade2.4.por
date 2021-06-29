programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		inteiro numeroInteiro=0 
		escreva("digite um número qualquer")
		leia(numeroInteiro)
		se(numeroInteiro>=0) {
			escreva("o numero digitado é positivo")
		}
		senao {
			escreva("o número digitado é negativo")
		}
		se((numeroInteiro%2)==0){
			escreva("esse numero é par.")
		}
		senao {
			escreva("esse numero é impar")
		}
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 10; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */