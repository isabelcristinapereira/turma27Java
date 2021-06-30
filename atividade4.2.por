programa
{


	
	funcao inicio()
	{
		inteiro dado[10], soma=0, ocorrencia=0, maiorNumero=0
		real media=0.0
		para (inteiro i=0; i<10; i++ ) {
		escreva("digite o valor do" + (i+1) + "o lançamento")
		leia(dado[i])
		soma= soma + dado[i]
		media= soma/10.0
		se(maiorNumero <= dado[i]){
			maiorNumero = dado[i]
			
		}
		para(inteiro i=0; i<10;i++){
			se(maiorNumero == dado[i]){
				ocorrencia++
				
				
			}
		}
		escreva("A soma dos lançamentos é" + soma , "\n")
		escreva("A média dos lançamentos é:" + media + "\n")
		escreva("O valor:" , maiorNumero + "foi o maior numero" + ocorrencia + "vezes")
			
		}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 475; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */