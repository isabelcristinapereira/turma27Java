programa
{// aproveitamento do aluno a=10,9 b=8,9 e 8,0 c=7,9 e 7,0 d=6,9 e 6,0
//e=5,9 e 5,0 f=abaixo de 5,0.
	
	funcao inicio()
	{
	real n1, n2, m
		escreva("digite a sua primeira nota")
		leia(n1)
		escreva("digite a sua segunda nota")
		leia(n2)
		m= (n1+n2)/2
		se((m>=10)e(m<=9)){
			escreva("aproveitamento A")
		}
		senao
		se(m>=8 e m<=8.9){
			escreva("aproveitamento B")
			
		}
		senao
		se(m>=7 e m<=7.9){
			escreva("aproveitamento B")
		}
		senao
		se(m>=6 e m<=6.9){
			escreva("aproveitamento C")
		}
		senao
		se(m>=5 e m<=5.9){
			escreva("aproveitamento D")
		}
		senao
		se(m>=5 e m<=5.9){
			escreva("aproveitamento E")
		}
		senao
		se(m>=8 e m<=8.9){
			escreva("aproveitamento F")
		}
		senao
		se(m>=8 e m<=8.9){
			escreva("aproveitamento B")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 549; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */