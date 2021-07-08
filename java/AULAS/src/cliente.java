
public class cliente {
	
      public int cadastro; //esta ativo //atalizaçãocadastral
      public String nome;
      public int divida=0; //contem alguma divida
      public double valorParcela; 
      public boolean atividade;
      
      public void cadastroAtivo(){
    	  atividade=true;
    	  System.out.println("O cadastro do cliente está ativo!");
      }
       public void cadastroDesativo(){
    	   atividade=false;
    	  if(divida==0){
    		  
    	  System.out.println("O cliente pode se desligar da empresa.");
    	    
    	  } 
    	  else {
    		  System.out.println("O cliente precisa pagar sua divida antes de se desligar!");
    	  }
    		  
          }
       
   }
      

