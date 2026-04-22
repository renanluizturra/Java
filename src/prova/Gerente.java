package prova;

public class Gerente extends Funcionario {
    private String departamento;

    public Gerente(String nome, double salarioBase, String departamento) {
        super(nome, salarioBase); // Construtor do Pai
        this.departamento = departamento;
    }

    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }

    @Override
    public void mostrarPerfil() {
        // Aproveitamos o nome e salário do pai via Getters
        System.out.println("Nome: " + getNome() + 
                           " | Salário: R$ " + getSalarioBase() + 
                           " | Cargo: Gerente de " + departamento);
    }
}