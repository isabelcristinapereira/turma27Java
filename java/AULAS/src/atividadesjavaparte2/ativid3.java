package atividadesjavaparte2;

import java.util.Scanner;

public class ativid3 {

	public static void main(String[] args) {
		Scanner read=new Scanner (System.in);
		int idade;
		System.out.println("Digite a sua idade por favor: ");
		idade= read.nextInt();
		if(idade <=14) {
			System.out.println("você se encontra na categoria infantil.");
			
		}
		 if(idade >14&&>=17) {
			 System.out.println("você se encontra na categoria juvenil");
		 }
		 if(idade >=18&&<=25) {
			 System.out.println("você é um adulto.");
			 
		 }
		
	}

}
