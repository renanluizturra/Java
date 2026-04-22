package prova;

public class Aluno extends Pessoa {
    private double nota;

    public Aluno(String nome, int id, double nota) {
        super(nome, id); // Chama o construtor do Pai (Pessoa)
        this.nota = nota;
    }

    public double getNota() { return nota; }
    public void setNota(double nota) { this.nota = nota; }

    @Override
    public void mostrarDados() {
        // Usa os getters do pai e adiciona a nota
        System.out.println("ID: " + getId() + 
                           " | Nome: " + getNome() + 
                           " | Média: " + nota);
    }
}