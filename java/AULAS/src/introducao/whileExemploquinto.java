package introducao;
//fazer a conversão de moedas 4 vezes.
//real para dolar. dolar=2.0

import java.util.Scanner;

public class whileExemploquinto {

	public static void main(String[] args) {
      Scanner read=new Scanner (System.in);
      int contador=1, salto=0;
      double R=0, D=0;
      
      
      System.out.println("de quanto em quanto voce quer saltar?");
      salto=read.nextInt();
      while(contador<=salto) {
      System.out.println("quanto voce tem em reais");
      R=read.nextDouble();
      D=R/2; //um dolar vale dois reais, com isso 6 reais equivale a 3 dolares
      System.out.println("Você tem R$" + R +"em U$" + D);
      //note que a impressao esta dentro do laco enquanto.
      //toda vez que eu pedir o valor, ele vai resolver a conta.
      contador++;
    	  
      }
      
      
	}

}
