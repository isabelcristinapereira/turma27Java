import java.util.Scanner;

public class atividadeterceiralista {
	//Informar todos os números de 1000 a 1999 que 
	//quando divididos por 11 obtemos resto = 5. (FOR)


	public static void main(String[] args) {
		Scanner read=new Scanner (System.in);
    int numero=1000;
    int r=0;//resto
    while(numero<=1999) {
    	numero=numero+1;
    	r=numero%11;
    	if(r==5){
    	System.out.printf("%d\n",numero);
    		
    	}
    	
    }
    
    System.out.println("digite um número entre 1000 e 1099 ");
    numero= read.nextInt();
    
    
   		 
    
     

	}

}
