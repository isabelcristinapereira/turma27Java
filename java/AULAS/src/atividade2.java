import java.util.Random;
import java.util.Scanner;

//Um dado � lan�ado 10 vezes e o valor correspondente � anotado. 
//Fa�a um programa que gere um vetor com os lan�amentos, escreva esse vetor. 
//A seguir determine e imprima a m�dia aritm�tica dos lan�amentos, contabilize e 
//apresente tamb�m quantas foram as ocorr�ncias da maior pontua��o.

public class atividade2 {
	public static void main(String[]args) {
		int dado[]=new int[10];
		int media;
		int maiorOcorrencia=0;
		int somador=0;
		//char op;
		//o sorteador automatico vai ler do numero 1 ao numero 6
		//para nao precisar colocar na mao.
		 //criando um sorteador, usando javautilrandom
		Scanner leia=new Scanner(System.in);//isso � pra receber a informa��o0
		Random sort=new Random();
		for(int x=0;x<dado.length;x++) {
			dado[x]=sort.nextInt(6); //quantidades dos lados do dado
			//System.out.println("digite o valor do primeiro lan�amento");
			//
			//dado[x]=leia.nextInt();
			somador=somador+dado[x];
			
			         //pra perguntar se quer 
					//System.out.println("continua [S/N");
					//op=leia.next().toUpperCase().charAt(0);
					//if(op=='N') {
						//break;
			if(dado[x]>maiorOcorrencia) {
				maiorOcorrencia=dado[x];
				
			}
		}
		media=somador/dado.length;
		System.out.println("a m�dia � " + media); //use if em condicao
		
		System.out.println("a maior ocorrencia � " +maiorOcorrencia);
			
			
		
	
		
	}

}
