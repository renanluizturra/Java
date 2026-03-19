package exercicios_heranca;

public class Animal {


private String nome;
private int idade;

public Animal(String nome, int idade) {
	this.nome = nome;
	this.idade = idade;
}	

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
//método
public void exibirDados() {
	System.out.println("nome: " + nome);
	System.out.println("idade: " + idade);

	
}




}

