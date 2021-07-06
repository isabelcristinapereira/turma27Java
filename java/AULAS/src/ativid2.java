import java.util.Scanner;

public class ativid2 {
	//Ler 10 números e imprimir quantos são 
	//pares e quantos são ímpares. (FOR)


	public static void main(String[] args) {
		Scanner read=new Scanner (System.in);
		
		for(int numero=0;numero<=10;numero++) {
			if(numero%2==0){
				System.out.printf("%d\n",numero);
			}
			
		}
		for(int numero=0;numero<=10;numero++){
			if(numero%2==1){
			System.out.printf("%d\n",numero);
			
		     }
		
	     }
	}
}
