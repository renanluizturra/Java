package ExercicioComplementarPOO;

public class Aluno {

    private String nome;
    private double nota1;
    private double nota2;

    public Aluno(){}

    public Aluno(String nome, double nota1, double nota2){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }


    public double calcularMedia(){
        return (nota1 + nota2) / 2;
    }
    
    public String obterSituacao(){
        if(calcularMedia() >= 7){
            return "aprovado";
        } else {
            return "reprovado";
        }
    }

    public void exibirDados(){
        System.out.println("Nome: " + nome + " | Nota1 " + nota1 + " | Nota2 " + nota2 + " | Situação " + obterSituacao());
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota1() {
        return nota1;
    }

    public String getNome() {
        return nome;
    }
}