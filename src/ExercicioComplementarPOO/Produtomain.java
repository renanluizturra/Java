package ExercicioComplementarPOO;

import java.util.Scanner;

public class Produtomain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Produto sistema = new Produto();

        int opcao;

        do {

            System.out.println("\n=== CADASTRO DE PRODUTOS ===");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Contar produtos");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine();
            System.out.println("Teste; ");
            switch (opcao) {

                case 1:

                    System.out.print("Nome do produto: ");
                    String nome = sc.nextLine();

                    System.out.print("Preço do produto: ");
                    double preco = sc.nextDouble();

                    System.out.print("Quantidade do produto: ");
                    int quantidade = sc.nextInt();
                    sc.nextLine();

                    sistema.adicionarProduto(nome, preco, quantidade);

                    break;

                case 2:

                    sistema.listarProduto();

                    break;

                case 3:

                    sistema.contar();

                    break;

                case 0:

                    System.out.println("Saindo do sistema...");

                    break;

                default:

                    System.out.println("Opção inválida!");

            }

        } while (opcao != 0);

        sc.close();
    }
}