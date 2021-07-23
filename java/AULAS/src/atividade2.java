import java.util.Random;
import java.util.Scanner;

//Um dado é lançado 10 vezes e o valor correspondente é anotado. 
//Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
//A seguir determine e imprima a média aritmética dos lançamentos, contabilize e 
//apresente também quantas foram as ocorrências da maior pontuação.

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
		Scanner leia=new Scanner(System.in);//isso é pra receber a informação0
		Random sort=new Random();
		for(int x=0;x<dado.length;x++) {
			dado[x]=sort.nextInt(6); //quantidades dos lados do dado
			//System.out.println("digite o valor do primeiro lançamento");
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
		System.out.println("a média é " + media); //use if em condicao
		
		System.out.println("a maior ocorrencia é " +maiorOcorrencia);
			
			
		
	
		
	}

}
