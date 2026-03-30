package exercicio_abstracao;

public class PessoaMain {

	public static void main(String[] args) {

	Pessoa Aluno = new Aluno("Carlos", "Desenvolvimento de Sistema");
	Pessoa Professor = new Professor("Ana", "Programação Orientada a Objetos");
	
	Aluno.apresentar();
	Aluno.saudacao();
	Professor.apresentar( );
	Professor.saudacao();
	
}
}


	
