package introducao;
//caucular fatorial de um numero

import java.util.Scanner;

public class dowhilefatorial {
	//eu posso colocar um laco do dentro de outro laço
	//nesse caso foi usado para exibir quantas vezes ele quer fazer o processo de fatoração.

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		int numero; //fatorial do numero
		int contador;
		int fatorial; //o erro eu to inicializando o fatorial e ta zerando a conta.
		char op;
		do {
		System.out.println("digite um numero");
		numero=read.nextInt();
		contador=numero;
		fatorial=fatorial*contador;
		
		do {
			System.out.println(contador);
			contador=contador-1;
		}
		
		while(contador<1);
		System.out.println("o valor do fatorial é" +fatorial);
		System.out.println("quer continuar[S/N]");
		op=read.next().toUpperCase().charAt(0);
	}
		while(op=='N');
	}
		

}
