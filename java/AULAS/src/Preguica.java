
public class Preguica extends Animal{

	public Preguica(String nome, int idade, boolean som) {
		super(nome, idade, som);
		// TODO Auto-generated constructor stub
	}
	public void Subindo() {
		System.out.println("tá subindo na arvore");
	}

	@Override
	public void emitirSom() {
		System.out.println("emitindo som");
	}

}
