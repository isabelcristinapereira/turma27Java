package atividadesjavaparte2;

import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {
		Scanner read=new Scanner (System.in);
		int a;
		int b;
		int c;
		System.out.println("Digite o primeiro número inteiro: ");
		a= read.nextInt();
		System.out.println("Digite o segundo número inteiro: ");
		b= read.nextInt();
		System.out.println("Digite o terceiro número inteiro: ");
		c= read.nextInt();
		if(a>=b && a>=b ) {
			System.out.println("o maior numero é:" +a);
		}
		if(b>=a && b>=c) {
			System.out.println("o maior numero é: " +b);
			
				
		}
		System.out.println("o maior numero é:" +c);	
		
			
		

	}

}
