package introducao;

import java.util.Scanner;

public class lacoWhIile {
	//CONTAR DE 0 ATE QUANDO O USUARIO QUISER.
	//primeiro: eu preciso criar uma variavel para receber o valor que o usuario vai digitar.

	public static void main(String[] args) {
		Scanner read= new Scanner(System.in); //comando para a sa�da.
		int contador=0; //a proposta � come�ar em 0.
		int numeroFinal;
		System.out.println("onde o contador deve parar?");
		numeroFinal=read.nextInt();
		while(contador<=numeroFinal) { //estou dizendo que enquanto contador que inicia em 0
	   //menor ou igual o numero final ele para.
			contador++;
			System.out.println(contador);
			
			
		}

	}

}
