package introducao;

import java.util.Scanner;
//um numero primo so divide por um e por ele mesmo.

public class dowhileprimo {

	public static void main(String[] args) {
	     Scanner read=new Scanner(System.in);
	     int contador=1;
	     int numero=0;
	     System.out.println("digite um numero");
	     numero=read.nextInt();
	     do {
	    	 System.out.println(contador);
	    	 contador++;
	    	 if(numero%contador==0) {
	    		 
	    	 }
	    	 
	     }
	     while(contador>1);


	}

}
