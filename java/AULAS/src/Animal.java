
public class Animal {
//Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e comportamentos 
	//(observe a tabela), utilize os seus conhecimentos e distribua as características de forma que tudo o que for 
	//comum a todos os animais fique na classe Animal: 
	
	
	private String nome;
	private int idade;
	private boolean som;
	public Animal(String nome, int idade, boolean som) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.som = som;
	} 
//encap toda vez que eu quero chamar o meu atributo
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public boolean isSom() {
		return som;
	}
	public void setSom(boolean som) {
		this.som = som;
	}
	//metodo sem retorn:void, metodo com retorn
	public void emitirSom() {
		System.out.println();
	}
	
	
}

