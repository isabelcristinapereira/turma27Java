
public class While {
	//trata-se do uso do primeiro laço de repetição:while.
	//objetivo contar até 10.

	public static void main(String[] args) {
		int contador=0; //variavel de contagem
		while(contador<=100) {
			System.out.print(contador);
			contador=contador+10; //pra fazer a contagem e nao fazer o loop infinito de 0.
		}
		System.out.println("\nterminei de contar.");
		

	}

}
