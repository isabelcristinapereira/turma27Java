import java.util.Scanner;

public class lacofoor3 {
 //pedir 6 valores e analisar quantos valores estao entre 0 e 10;
	//usa-se %d para uma variavel ser aparecida
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		int valor,totalDez=0;
		int cont;
		int somaImpar=0;
		for(cont=1;cont<=3;cont++) {
			System.out.println("digite um valor");
			valor=read.nextInt();
			if(valor>=0&& valor<=10) {
				totalDez=totalDez+1; //aqui eu quero totalizar,, ou seja mais um valor entre 0 e 10
				//analisar por que que ele nao esta contando o total de numeros 
				//entre 0 e 10.
				//aqui eu querp somar os valores impar 
					
				}
			if(valor%2==1) {
				somaImpar=somaImpar+valor;
				
			}
		}
		System.out.printf("ao total foram exibidos :%d\n" , totalDez, "valores entre 0 e 10.");
		System.out.printf("no intervalo, a soma entre os numeros impar foi %d" , somaImpar);
	}

}
