package abstracao;

public abstract class Animal {
	
	private String nome;

	public Animal(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//método abstrato (sem corpo e a classe filha é OBRIGADA a implementar)
	
	public abstract void fazerSom();
	
	//método abstrato /CONCRETO
	public void dormir() {
		System.out.println(nome + " está dormindo");

	}
	
	

}
