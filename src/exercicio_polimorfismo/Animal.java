package polimorfismo;

public class Animal {
	
    protected String nome;
    protected int idade;
    protected double peso;
    
    
    public Animal(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }
    
    public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


    public void emitirSom() {
        System.out.println(nome + " fez um som.");
    }

    public String getTipoAlimento() {
        return "Alimento";
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome + " | Idade: " + idade + " | Peso: " + peso);
    }

    public String getNome() {
        return nome;
    }
}
