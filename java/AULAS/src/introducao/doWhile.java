package introducao;

import java.util.Scanner;

public class doWhile {

	public static void main(String[] args) {
		Scanner read= new Scanner(System.in);
		int numero=0,soma=0;
		char opc;
		 //rever esse exercicio.
		
		do
		{
			System.out.println("digite um numero: ");
			numero=read.nextInt();
			
			System.out.println("voce quer continuar? [S/N]");
			opc=read.next().toUpperCase().charAt(0);
			soma=soma+numero;
		}
		while(opc=='N'); 
		

		System.out.println("a soma de todos os valores é: " + soma);
			
		
		
		
	}

}
