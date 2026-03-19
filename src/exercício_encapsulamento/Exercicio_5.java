package exercício_encapsulamento;

public class Exercicio_5 {

    private String nome;
    private double nota1;
    private double nota2;

    // Construtor
    public Exercicio_5(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    // Calcular média
    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    // Mostrar situação
    public void mostrarSituacao() {
        double media = calcularMedia();

        System.out.println("Aluno: " + nome);
        System.out.println("Média: " + media);

        if (media >= 7) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }
    }
}