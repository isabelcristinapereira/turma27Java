package turma27Javamain;

import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {
		Scanner read=new Scanner (System.in);
        int numero;
        
        System.out.println("digite um número: ");
        numero= read.nextInt();
        if ((numero%2)==0) {
       		 System.out.printf("o numero é par e sua raíz quadrada é: %.2f\n" , Math.sqrt(numero));
        }
        
        else {
        	System.out.printf("o numero é impar e seu quadrado é: %.2f\n" , Math.pow(numero,2));
        	
         
       		 
       	 } 
        
        
        	
       	 

	}

}
