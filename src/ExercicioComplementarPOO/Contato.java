package ExercicioComplementarPOO;

import java.util.ArrayList;

public class Contato {
	
	private String nome;
	private String telefone;
	
	//arraylist
	private ArrayList<Contato> contatos = new ArrayList<>();
	
	public Contato() {
		
	}
	public Contato(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public void exibirDados() {
		System.out.println("Nome:" + nome);
		System.out.println("Telefone:" + telefone);
		
	}
	
	public void adicionar(String nome, String telefone) {
		Contato novoContato = new Contato(nome, telefone);
		contatos.add(novoContato);
		System.out.println("Contatos adicionado. ");
		
	}
	public void listar() {
		if(contatos.isEmpty()) {
			System.out.println("Contato vazio.");
			return;
		}
		System.out.println("Lista encontrada");
		for(Contato total: contatos) {
				System.out.println(total);{
					
				}
				
				
			}
	
	
	
}
}

