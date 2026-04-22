package prova;


public class Pessoa {
    private String nome;
    private int id; // Matrícula ou Registro Geral

    public Pessoa(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    // Método polimórfico
    public void mostrarDados() {
        System.out.println("ID: " + id + " | Nome: " + nome);
    }
}