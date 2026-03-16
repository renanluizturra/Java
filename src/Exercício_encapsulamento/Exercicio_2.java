package Exercício_encapsulamento;

public class Exercicio_2 {

    private String nome;
    private double preco;
    private int quantidade;

    // Construtor
    public Exercicio_2(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Getter nome
    public String getNome() {
        return nome;
    }

    // Setter nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter preco
    public double getPreco() {
        return preco;
    }

    // Setter preco
    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Getter quantidade
    public int getQuantidade() {
        return quantidade;
    }

    // Setter quantidade
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // Método para mostrar produto
    public void exibirProduto() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
    }
}