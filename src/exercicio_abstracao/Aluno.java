package exercicio_abstracao;

public class Aluno extends Pessoa{
	
	private String curso;

	public Aluno(String nome, String curso) {
		super(nome);
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public void apresentar() {
		System.out.println(getNome()+ "Sou aluno do curso " + curso);
	}
	
	
	
	

}
