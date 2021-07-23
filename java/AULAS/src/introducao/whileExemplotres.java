package introducao;

import java.util.Scanner;
//nesse exemplo eu quero que o usuario decida qual vai ser o salto do meu contador

public class whileExemplotres {
	//pedir pra que o usuario diga ate quando que ele quer que vai o contador
	//e de quanto em quanto esse contador deve saltar.

	public static void main(String[] args) {
		Scanner read=new Scanner (System.in);
		int contador=0;
		int salto;
		int valorFinal;
		System.out.println("o contador deve ir até quanto?");
		valorFinal=read.nextInt();
		System.out.println("de quanto em quanto será o salto? ");
		salto=read.nextInt();
		while(contador<=valorFinal) {
			System.out.println(contador);
			contador=contador+salto;
			
		}

	}

}
