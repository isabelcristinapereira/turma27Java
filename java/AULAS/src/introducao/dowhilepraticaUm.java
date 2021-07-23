package introducao;
//contar de 1 até 10 com a estrutura do while
//exibir a tabuada de um numero qualquer.
//na estrutra enquanto é ate o valor do cont ser menor que dez, no faca enquanto é maior
//logica inversa.
import java.util.Scanner;

public class dowhilepraticaUm {

	public static void main(String[] args) {
		Scanner read= new Scanner(System.in);
		int contador=1, N=0, R=0;
		N=7;
		
		do {
			contador++;
			System.out.print(N+contador+ "x" + +R);
			R=N*7;
				
		}
		while(contador>10);
		


	}

}
