package introducao;

import java.util.Scanner;

public class parimpar {

	public static void main(String[] args) {
		Scanner read=new Scanner (System.in);
         int numero;
         System.out.println("digite um n�mero");
         numero= read.nextInt();
         if(numero>0) {
        	 if (numero%2==0) {
        		 System.out.println("� par.");
        	 } else {
        		 System.out.println("� �mpar.");
        	 }
        	 
         } if else(numero==0) {
        	 System.out.println("n�mero neutro.");
        	 
            } 
         else {
        	 
        	 System.out.println("esse n�mero � inv�lido.");
         }
	}

}
