package exercicios_heranca;

public class Aluno extends Pessoa {

    private String matricula;
    private String curso;

    public Aluno(String nome, String cpf, int idade, String matricula, String curso) {
        super(nome, cpf, idade);
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Matrícula: " + matricula);
        System.out.println("Curso: " + curso);
       
    }
}