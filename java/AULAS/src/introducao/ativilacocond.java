package introducao;

import java.util.Scanner;

public class ativilacocond {

	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
      
		  int numeroDigitado;
		  System.out.println("Dgite um n�mero");
		  numeroDigitado= leia.nextInt();
		  if(numeroDigitado >0) {
			  if (numeroDigitado%2==0) {
				  System.out.println("o numero digitado � par");
			  } else {
				  System.out.println("o numero digitado � �mpar");
				  
			      }    
			  
		  }
		  if  (numeroDigitado==0) { 
	      System.out.println("o numero digitado � neutro");
		  }
		  if (numeroDigitado<0) {
			  System.out.println("desculpe, o programa n�o roda numero negativo.");
			  
		  }
	      
	}

}
