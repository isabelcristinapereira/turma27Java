
public class carro {

	
	 public boolean portamalaEspaçoso; 
	 public int  portas;
	 public String cor, modelo;
	 public boolean ligado; //atributo do tipo estado
	 public int velocidade=0; //carroDesligado
	 
	                        //método pra ligar o carro, quero que 
	                        //ele retorne para o programa.
	                        //método para acelerar, velocidade 1 em 1
	 
	 
	 
	 
	 
	 
	 public void ligarCarro(){  //sem retorno
		 ligado=true;
		 System.out.println("carro ligando...");
		                     
   
    	}
	 public void desligarCarro() { //metodo para desligar o carro
		 if(velocidade==0){
			 ligado=false;
		    	System.out.println("desligando carro...");	
		 else{
			 ligado=true;
			 System.out.println("carro ligado");
			 
		 }
		
			 
			 
		 }
	    	
		 }
	 public void velocidade() {
		 velocidade++;           //acelerar1+1
	 }
     public void 
}
