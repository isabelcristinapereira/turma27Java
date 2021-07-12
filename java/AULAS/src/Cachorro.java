
public class Cachorro extends Animal{

	public Cachorro(String nome, int idade, boolean som) {
		super(nome, idade, som);
		// TODO Auto-generated constructor stub
	}
	public void correr() {
		System.out.println("correndo");
		
	}
	@Override
	public void emitirSom() {
		System.out.println("au au");
	}

}
