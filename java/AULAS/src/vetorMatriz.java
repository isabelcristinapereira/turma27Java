import java.util.Arrays;
import java.util.Scanner;

public class vetorMatriz {
	//Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma 
	//atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente. 

	public static void main(String[] args) {
		int pontuacao[]=new int[5];
		int maiorPontuacao=0;
		int numeroDigitado=0;
		Scanner leia=new Scanner(System.in);
		for(int x=0;x<pontuacao.length;x++) {
			System.out.println("Digite um n�mero");
			numeroDigitado=leia.nextInt(); //numero digitado recebe o que o usuario digitar
			pontuacao[x]=numeroDigitado;
			if(pontuacao[x]>maiorPontuacao) {
				maiorPontuacao=pontuacao[x];
				
			}
			
			
		}
		System.out.println(Arrays.toString(pontuacao)+"\n");
		System.out.println("a maior pontua��o foi" +maiorPontuacao);
		System.out.println(pontuacao[2]);
		

	}

}
