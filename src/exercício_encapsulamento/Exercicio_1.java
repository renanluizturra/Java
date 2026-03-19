package exercício_encapsulamento;

public class Exercicio_1 {

	private String nome;
	private int idade;
	
	//construtor mesmo nome da classe
	public Exercicio_1(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	//métodos de acesso
	//getter > acessar/chamar .get
	//setter > alterar/modificar .set

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
	

}