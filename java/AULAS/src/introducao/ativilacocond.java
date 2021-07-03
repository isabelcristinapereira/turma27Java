package introducao;

import java.util.Scanner;

public class ativilacocond {

	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
      
		  int numeroDigitado;
		  System.out.println("Dgite um número");
		  numeroDigitado= leia.nextInt();
		  if(numeroDigitado >0) {
			  if (numeroDigitado%2==0) {
				  System.out.println("o numero digitado é par");
			  } else {
				  System.out.println("o numero digitado é ímpar");
				  
			      }    
			  
		  }
		  if  (numeroDigitado==0) { 
	      System.out.println("o numero digitado é neutro");
		  }
		  if (numeroDigitado<0) {
			  System.out.println("desculpe, o programa não roda numero negativo.");
			  
		  }
	      
	}

}
