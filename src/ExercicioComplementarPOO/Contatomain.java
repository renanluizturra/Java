package ExercicioComplementarPOO;

import java.util.Scanner;

public class Contatomain {

	public static void main(String[] args) {


		        Scanner sc = new Scanner(System.in);
		        Contato agenda = new Contato();

		        int opcao;

		        do {

		            System.out.println("\n=== AGENDA DE CONTATOS ===");
		            System.out.println("1 - Adicionar contato");
		            System.out.println("2 - Listar contatos");
		            System.out.println("0 - Sair");
		            System.out.print("Escolha: ");

		            opcao = sc.nextInt();
		            sc.nextLine();

		            switch (opcao) {

		                case 1:

		                    System.out.print("Nome: ");
		                    String nome = sc.nextLine();

		                    System.out.print("Telefone: ");
		                    String telefone = sc.nextLine();

		                    agenda.adicionar(nome, telefone);

		                    break;

		                case 2:

		                    agenda.listar();

		                    break;

		                case 0:

		                    System.out.println("Saindo da agenda...");

		                    break;

		                default:

		                    System.out.println("Opção inválida!");

		            }

		        } while (opcao != 0);

		        sc.close();
		    }
		}