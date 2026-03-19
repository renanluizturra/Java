package exercicios_heranca;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaEscolamain {

	    public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);
	    ArrayList<Pessoa> lista = new ArrayList<>();

	    int opcao;

	    do {
	      System.out.println("=== MENU ===");
	      System.out.println("1 - Cadastrar Aluno");
	      System.out.println("2 - Cadastrar Professor");
	      System.out.println("3 - Listar Todos");
	      System.out.println("0 - Sair");
	      System.out.print("Escolha: ");
	      opcao = sc.nextInt();
	      sc.nextLine();

	     switch (opcao) {

	     case 1:
	      System.out.print("Nome: ");
	      String nomeAluno = sc.nextLine();

	      System.out.print("CPF: ");
	      String cpfAluno = sc.nextLine();

	      System.out.print("Idade: ");
	      int idadeAluno = sc.nextInt();
	      sc.nextLine();

	      System.out.print("Matrícula: ");
	      String matricula = sc.nextLine();

	      System.out.print("Curso: ");
	      String curso = sc.nextLine();

	      lista.add(new Aluno(nomeAluno, cpfAluno, idadeAluno, matricula, curso));
	      System.out.println("Aluno cadastrado!");
	      break;

	     case 2:
	    	 System.out.print("Nome do Professor: ");
             String nomeProfessor = sc.nextLine();

             System.out.print("CPF Professor: ");
             String cpfProfessor = sc.nextLine();

             System.out.print("Idade: ");
             int idadeProfessor = sc.nextInt();
             sc.nextLine();

             System.out.print("Disciplina: ");
             String disciplina = sc.nextLine();

             System.out.print("Salário: ");
             double salario = sc.nextDouble();

             lista.add(new Professor(nomeProfessor, cpfProfessor, idadeProfessor, disciplina, salario));
             System.out.println("Professor cadastrado!");
             break;	 

	     case 3:
             if (lista.isEmpty()) {
                 System.out.println("Lista vazia!");
             } else {
                 for (Pessoa professor : lista) {
                     professor.exibirDados();
                 }
             }
             break;

         case 0:
             System.out.println("Saindo...");
             break;

         default:
             System.out.println("Opção inválida!");
     }

 } while (opcao != 0);

 sc.close();
}
}