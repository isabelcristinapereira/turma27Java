import java.util.Scanner;

public class lacoFor {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		int somador=0;
		int cont=1;
		int numero=0;
		
		
		for(cont=1;cont<=5;cont++) {
			System.out.println("digite um numero");
			numero=read.nextInt();
			somador=somador+numero;
			
		}
        System.out.println("a soma dos numeros digitados é: " +somador);
	}

}
