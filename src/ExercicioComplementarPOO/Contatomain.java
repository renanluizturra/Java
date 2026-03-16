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
            System.out.println("3 - Buscar contato");
            System.out.println("4 - Remover contato");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:

                    System.out.print("Digite o nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Digite o telefone: ");
                    String telefone = sc.nextLine();

                    agenda.adicionar(nome, telefone);

                    break;

                case 2:

                    agenda.listar();

                    break;

                case 3:

                    System.out.print("Digite o nome para buscar: ");
                    String busca = sc.nextLine();

                    agenda.buscarNome(busca);

                    break;

                case 4:

                    System.out.print("Digite o nome para remover: ");
                    String remover = sc.nextLine();

                    agenda.remover(remover);

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