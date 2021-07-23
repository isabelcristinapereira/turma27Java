package introducao;

import java.util.Scanner;

//dizer quais numeros sao negativos
//atentar=se pra quando ler fora e dentro do laco
//quando eu quero que leia varias vezes tem que ser dentro do laço.
//a soma dos numeros negativos.
public class doWhilie {

	public static void main(String[] args) {
     Scanner read=new Scanner(System.in);
     int numero;
     int cont=1;
     int negativo=0; //para ser negativo <0
     do{
    	 System.out.println("digite um numero");
    	 numero=read.nextInt();
    	 cont=cont+1;
    	 if(negativo<0) {
    		 negativo=negativo+1;
    		 
    	 }
    	 
     }
     while(cont>10);
     System.out.println("foi digitados" +negativo);
     
	}

}
