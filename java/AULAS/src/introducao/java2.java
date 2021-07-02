package introducao;

import java.util.Scanner;

public class java2 {
	public static void main(String[] args) {
		Scanner read= new Scanner(System.in);
		int dias;
		int meses;
		int anos;
		int idadeDias;
		System.out.println("digite a sua idade expressa em dias");
		idadeDias= read.nextInt();
		anos= idadeDias/365;
		meses=(idadeDias%365)/30;
		dias=(idadeDias%365)%30;
		System.out.printf("\nVocê tem:" + anos + "anos\n" + meses + "meses\n" + dias + "dias\n");
		
		
		
		
	} 

}
