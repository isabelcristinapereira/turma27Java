


	package TryCatch;

	import java.util.Scanner;

	public class TesteErro {

		public static void main(String[] args) {
			Scanner read = new Scanner(System.in);
			int valor=0;
			String nome[] = new String[3];


			try {
				System.out.println("Digite a posição para cadastro do nome [0-2]");
				valor = read.nextInt();
				System.out.println("Digita o nome:");
				nome[valor] = read.next();
			}catch(java.lang.ArrayIndexOutOfBoundsException e){
				System.out.println("Ai é osso");
			}


			System.out.println("O "+ nome[valor] + " esta na posisção "+valor);
		}

	}
	 30  java/AULAS/src/TryCatch/testeArquivo.java 
	@@ -0,0 +1,30 @@
	package TryCatch;

	import java.io.File;
	import java.io.IOException;
	import java.util.Scanner;

	public class testeArquivo {

		public static void main(String[] args) {
			File arq = new File("C:\\temp1\\turma27.txt");
			Scanner read = null;

			try {
				read = new Scanner(arq);
				while(read.hasNextLine()) {
					System.out.println(read.next());
				}
			}
			catch(IOException erro) {
				System.out.println("Erro");
			}
			finally {
				if(read!=null) {
					read.close();
				}
				System.out.println("Nois");
			}
		}

	}
	  3  java/Bank/src/app/MainApp.java 
	@@ -22,6 +22,9 @@ public static void main(String[] args) {
			numero = random.nextInt(1000);
			nome= JOptionPane.showInputDialog("Seja Bem Vinde ao Banco FCBM!\nPoderia nos informar seu nome?");
			dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia de hoje:"));
			if(dia>31 || dia<=0) {
				JOptionPane.showMessageDialog(null,"No nosso banco o cliente sempre tem razão! (Mesmo que esse dia não esteja no calendario)");
			}
			JOptionPane.showMessageDialog(null,"Olá "+nome+" sua conta foi aberta!\nO numero dela é: "+numero);


	  79  java/Bank/src/entidades/ContaCorrente.java 
	@@ -3,14 +3,14 @@
	import javax.swing.JOptionPane;

	public class ContaCorrente extends Conta{
		
		


		public ContaCorrente(int numero, String nomeCliente) {
			super(numero, nomeCliente);
			// TODO Auto-generated constructor stub
		}

		private int talaoDeCheque=3;
		private int quantidadeDeTaloes;

		public int getTalaoDeCheque() {
			return talaoDeCheque;
	@@ -19,54 +19,55 @@ public int getTalaoDeCheque() {
		public void setTalaoDeCheque(int talaoDeCheque) {
			this.talaoDeCheque = talaoDeCheque;
		}
		

		public void talaoPeca(int quantidadeDeTaloens) {
	    if (quantidadeDeTaloens<=talaoDeCheque) {

	    	talaoDeCheque=talaoDeCheque-quantidadeDeTaloens;
	    	this.debito(quantidadeDeTaloens*30);

	    }
	    else {
	    	JOptionPane.showMessageDialog(null,"opção inválida!");
	    }
			double aux;
			aux = quantidadeDeTaloes*30;

			if (quantidadeDeTaloens<=talaoDeCheque && this.saldo>aux) {
				talaoDeCheque=talaoDeCheque-quantidadeDeTaloens;
				this.debito(quantidadeDeTaloens*30);
			}
			else {
				JOptionPane.showMessageDialog(null,"opção inválida!");
			}
		}
		@Override
		

		public void telas() {
			

			int opc, quantidadeDeTaloens;
			double valor;
			
			


			do {
				opc = Integer.parseInt(JOptionPane.showInputDialog("Bem vinde "+this.getNomeCliente()+" a sua Conta Corrente - Nº "+this.getNumero()+" digite:\n1-Debito\n2- Credito\n3- Pedir talão\n4- para sair\n\nSaldo atual: R$"+this.getSaldo()+"restante de taloens de cheque que você tem"+"\n\n Quantidade de movimentos restantes: "+(10-this.qtdMovimentos)));
				opc = Integer.parseInt(JOptionPane.showInputDialog("Bem vinde "+this.getNomeCliente()+" a sua Conta Corrente - Nº "+this.getNumero()+" digite:\n1-Debito\n2- Credito\n3- Pedir talão\n4- para sair\n\nSaldo atual: R$"+this.saldo+"\nTaloens de cheque disponiveis: "+this.talaoDeCheque+"\n\n Quantidade de movimentos restantes: "+(10-this.qtdMovimentos)));
				switch(opc) {
					case 1:
						valor=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do débito:"));
						this.debito(valor);
						break;
					case 2:
						valor=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do crédito:"));
						this.credito(valor);
						break;
					case 3:
						quantidadeDeTaloens=Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de taloens que você deseja:"));
						talaoPeca(quantidadeDeTaloens);
						
						break;
					case 4:
						JOptionPane.showMessageDialog(null,"Obrigado por ultilizar nosso banco!");
						break;
					default: 
						JOptionPane.showMessageDialog(null,"Opção invalida!\nPor favor, tente novamente!");
						break;
				case 1:
					valor=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do débito:"));
					this.debito(valor);
					break;
				case 2:
					valor=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do crédito:"));
					this.credito(valor);
					break;
				case 3:
					quantidadeDeTaloens=Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de taloens que você deseja:"));
					talaoPeca(quantidadeDeTaloens);

					break;
				case 4:
					JOptionPane.showMessageDialog(null,"Obrigado por ultilizar nosso banco!");
					break;
				default: 
					JOptionPane.showMessageDialog(null,"Opção invalida!\nPor favor, tente novamente!");
					break;
				}
			}while(opc!=4 && this.qtdMovimentos<=10);
			if(this.qtdMovimentos>10) {
				

				JOptionPane.showMessageDialog(null,"A quantidade de movimentaçoens excede o limite");
				

			}
		

}
