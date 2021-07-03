package introducao;

import java.util.Scanner;

public class parimpar {

	public static void main(String[] args) {
		Scanner read=new Scanner (System.in);
         int numero;
         System.out.println("digite um número");
         numero= read.nextInt();
         if(numero>0) {
        	 if (numero%2==0) {
        		 System.out.println("é par.");
        	 } else {
        		 System.out.println("é ímpar.");
        	 }
        	 
         } if else(numero==0) {
        	 System.out.println("número neutro.");
        	 
            } 
         else {
        	 
        	 System.out.println("esse número é inválido.");
         }
	}

}
