programa
{
	
	funcao inicio()
	{
	real m, a, imc=0
		escreva("qual o seu kg em massa")
		leia(m)
		escreva("qual a sua altura?")
		leia(a)
		imc=m/(a^2)
		se(imc>17){
			escreva("muito abaixo do peso")
			
		}
		senao 
		se ((imc>=17)e(imc<18.5)){
			escreva("abaixo do peso")
			
		}
		senao
		se((imc<=18.5)e(imc<25)){
			escreva("peso ideal")
		}
		senao
		se((imc>=25)e(imc<=30)){
			escreva("sobrepeso")
		}
		senao 
		se((imc>=30)e(imc>=35)){
			escreva("obesidade")
		}
		senao
		se((imc>=35)e(imc<=40)){
			escreva("obesidade severa")
		}
		senao
		escreva("obesidade morbida")
			
		
			
		
		
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 9; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */