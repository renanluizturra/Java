package exerciciocomplementarpoo;

import java.util.ArrayList;
import java.util.Scanner;


public class Alunomain {

	    public static void main(String[] args){

	        Scanner sc = new Scanner(System.in);
	        ArrayList<Aluno> alunoArrayList = new ArrayList<>();

	        int opcao = 0;
	        double nota1 = 0;
	        double nota2 = 0.0;
	        double total = 0;

	        do {
	            System.out.println("=== CADASTRO DE ALUNOS ===");
	            System.out.println("1. Adicionar aluno");
	            System.out.println("2. Listar alunos");
	            System.out.println("3. Buscar aluno por nome");
	            System.out.println("4. Mostrar aprovados");
	            System.out.println("5. Mostrar reprovados");
	            System.out.println("6. Calcular média da turma");
	            System.out.println("0. Sair");
	            opcao = sc.nextInt();
	            sc.nextLine();

	            switch (opcao){
	                case 1:

	                    System.out.println("Nome:");
	                    String nome = sc.nextLine();

	                    System.out.println("Nota 1: ");
	                    nota1 = sc.nextDouble();

	                    while(nota1 > 10 || nota1 < 0) {

	                        System.out.println("Nota 1 invalida: " + nota1 + " | Digite novamente: ");
	                        nota1 = sc.nextDouble();
	                        sc.nextLine();
	                    }

	                    System.out.println("Nota 2: ");
	                    nota2 = sc.nextDouble();

	                    while(nota2 > 10 || nota2 < 0){
	                        System.out.println("Nota 2 invalida. " + nota2 + " | Digite novamente: ");
	                        nota2 = sc.nextDouble();
	                        sc.nextLine();
	                    }

	                    sc.nextLine();

	                    System.out.println("Com sucesso!");
	                    alunoArrayList.add(new Aluno(nome, nota1, nota2));

	                    break;

	                case 2:

	                    for(Aluno a : alunoArrayList){
	                        a.exibirDados();
	                    }

	                    break;

	                case 3:

	                    if(alunoArrayList.isEmpty()){
	                        System.out.println("Lista está vazia.");
	                        break;
	                    }

	                    System.out.println("Digite o nome do aluno que deseja encontrar: ");
	                    String alunoQProcura = sc.nextLine();

	                    for(Aluno a : alunoArrayList){
	                        if(a.getNome().contains(alunoQProcura)){
	                            System.out.println("Achou o aluno que procura. " + alunoQProcura);
	                        } else {
	                            System.out.println("Não existe.");
	                        }
	                    }

	                    break;

	                case 4:

	                    for(Aluno a : alunoArrayList){
	                        if(a.obterSituacao().equals("aprovado")){
	                            a.exibirDados();
	                        }
	                    }

	                    break;

	                case 5:

	                    for(Aluno a : alunoArrayList){
	                        if(a.obterSituacao().equals("reprovado")){
	                            a.exibirDados();
	                        }
	                    }

	                    break;

	                case 6:

	                    if(alunoArrayList.isEmpty()){
	                        System.out.println("List vazia.");
	                    }

	                    for(Aluno a : alunoArrayList){
	                        a.calcularMedia();
	                    }

	                    double media = total / alunoArrayList.size();

	                    break;

	            }

	        }while(opcao != 0);

	        System.out.println("Saindo do sistema.");

	        }
	}