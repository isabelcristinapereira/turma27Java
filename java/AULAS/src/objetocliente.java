import java.util.Scanner;

public class objetocliente {

	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		cliente cliente1=new cliente();
		String opc;
		
		System.out.println("Qual o seu nome? : ");
		cliente1.nome=leia.next();
		System.out.println("Informe o n�mero do seu cadastro? :");
		cliente1.cadastro=leia.nextInt();
		System.out.println("Voc� quer desativar?[S/N]");
		opc=leia.next();
		if(opc=="S"){
			cliente1.cadastroDesativo();
			System.out.println("Sua conta foi desativada!");
			
		}
		else if(opc=="N") {
			cliente1.cadastroAtivo();
		
		}
		
		
		System.out.printf("Situa��o da conta" +cliente1.cadastro+" -nome: " +cliente1.nome+"� :"+ cliente1.atividade);
				
		
		

	}

}
