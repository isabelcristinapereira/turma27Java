import java.util.Scanner;

public class ativid2 {
	//Ler 10 n�meros e imprimir quantos s�o 
	//pares e quantos s�o �mpares. (FOR)


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
