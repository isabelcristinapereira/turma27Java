package introducao;

import java.util.Scanner;

public class whileExQUATRO {
	//diferen�a de ler dentro do la�o e fora do la�o.
	//ou seja, ler fora da estrtura while e dentro da estrutura while(enquanto)
	//objetivo: ler 10 numeros e soma-los.
	//eu sei que sao 10 repeticoens, mas em cada repeticao eu vou pedir um numero.

	public static void main(String[] args) {
		Scanner read=new Scanner (System.in);
		int contador=1; //esse 0 inicializa as variaiveis.
		int numero=0;
		int soma=0;
		int maiorValor=0;
		int menornumero=0;
		
		while(contador<=3) {//aqui estou pedidno para sair "digite o numero 3 vezes"
			System.out.println("digite um numero");//esta sendo imprimido 3 vezes.
			numero=read.nextInt();
			soma=soma+numero; //minha soma � a acumula�ao do que eu li anteriormente.
			contador++;//pra nao cair no loop.
			if(numero>maiorValor) { //uso a condicao se para o programa observar se o numero digitado
				//� maior que o maior valor que � 0
				//ou seja: 1 � maior que 0, s� que 3 � maior que 1 e 0.
				//imprimeiro maior numero e imprimir menor numero
				maiorValor=numero;
				
				}
				
		   }
			
		}
		System.out.printf("a soma entre os numeros � : " + soma);
		System.out.println("o maior valor digitado foi : " + maiorValor);
		System.out.println("o menor valor digitado foi :" + menornumero);
				

	}

}
