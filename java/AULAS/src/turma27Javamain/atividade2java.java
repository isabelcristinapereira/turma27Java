package turma27Javamain;

import java.util.Scanner;

public class atividade2java {

	public static void main(String[] args) {
		Scanner read=new Scanner (System.in);
		int n1;
		int n2;
		int n3;
		System.out.println("Digite o primeiro número: ");
		n1= read.nextInt();
		System.out.println("Digite o segundo número: ");
		n2= read.nextInt();
		System.out.println("Digite o terceiro número: ");
		n3= read.nextInt();
		if (n1==n2 && n2==n3) {
			System.out.printf("%d - %d - %d", n1, n2, n3);
			
		}
		else if (n1>n2 && n2>n3) {
			System.out.printf("%d - %d - %d", n3, n2, n1 );
			
		}
		else if (n1>n2 && n2>n3) {
			System.out.printf("%d - %d - %d" , n2, n3, n1);
			
		}

	}

}
