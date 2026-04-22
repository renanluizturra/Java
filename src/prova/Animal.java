package prova;

public class Animal {
    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    // Método que será sobrescrito (Polimorfismo)
    public void emitirSom() {
        System.out.println("O animal " + nome + " emite um som genérico.");
    }
}