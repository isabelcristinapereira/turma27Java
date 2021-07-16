import java.util.Arrays;
import java.util.Scanner;

public class vetorMatriz {
	//Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma 
	//atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente. 

	public static void main(String[] args) {
		int pontuacao[]=new int[5];
		int maiorPontuacao=0;
		int numeroDigitado=0;
		Scanner leia=new Scanner(System.in);
		for(int x=0;x<pontuacao.length;x++) {
			System.out.println("Digite um número");
			numeroDigitado=leia.nextInt(); //numero digitado recebe o que o usuario digitar
			pontuacao[x]=numeroDigitado;
			if(pontuacao[x]>maiorPontuacao) {
				maiorPontuacao=pontuacao[x];
				
			}
			
			
		}
		System.out.println(Arrays.toString(pontuacao)+"\n");
		System.out.println("a maior pontuação foi" +maiorPontuacao);
		System.out.println(pontuacao[2]);
		

	}

}
