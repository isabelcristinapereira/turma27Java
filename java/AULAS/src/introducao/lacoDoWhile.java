package introducao;
//usando do while, a expressão é logicamente inversa.

import java.util.Scanner;

public class lacoDoWhile {

	public static void main(String[] args) {
     Scanner read=new Scanner(System.in);
     int N=0,S=0;
     int cont=1;
     char opc;//caracter:char.
     //nao se usa o contador aqui, e sim a opcao S,N.
     //aqui eu nao sei ate quanto o usuario vai querer ai eu deixo ele acionar
     //e dizer se quer continuar, quando ele digitar n o programa sai.
     
     opc='S';
     
     while(opc=='S') {
    	 System.out.println("digite um valor");
    	 N=read.nextInt();
    	 System.out.println("quer continuar? [S/N]");  
    	 opc=read.next().toUpperCase().charAt(0);                       
    	 S=S+N;
    	 cont++;
    	 if(opc=='N') {
    		 break;
    		 
    	 }
    	 
    	 
     }
     System.out.println("A soma dos numeros são: " +S);
     //int contador=1;
     //int numero=0;
     //int soma=0;
     //int salto=0; //ate quando o usuario quer que va o contador.
     //System.out.println("quanto voce quer que seja o salto: ");
     //salto=read.nextInt();
     //while(contador<=salto){
    	 //System.out.println("digite um numero");
        // numero=read.nextInt();
         //soma=soma+numero;
       // contador++;
     //}
     //System.out.println("a soma dos numeros são: " +soma);
     }

}
