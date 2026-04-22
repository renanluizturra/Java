package prova;

import java.util.ArrayList;
import java.util.Scanner;

public class AgendaContatosMain {

    public static void main(String[] args) {
        ArrayList<Contato> contatos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== AGENDA DE CONTATOS ===");
            System.out.println("1. Adicionar contato");
            System.out.println("2. Listar contatos");
            System.out.println("3. Buscar por nome");
            System.out.println("4. Remover contato");
            System.out.println("5. Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine(); // Limpeza de buffer

            switch (opcao) {
                case 1:
                    System.out.print("Tipo de contato (1) Pessoal ou (2) Comercial? ");
                    int tipo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Telefone: ");
                    int tel = sc.nextInt();
                    sc.nextLine();

                    if (tipo == 1) {
                        contatos.add(new Contato(nome, tel));
                    } else if (tipo == 2) {
                        System.out.print("Empresa: ");
                        String empresa = sc.nextLine();
                        System.out.print("E-mail: ");
                        String email = sc.nextLine();
                        contatos.add(new ContatoComercial(nome, tel, empresa, email));
                    }
                    System.out.println("Sucesso!");
                    break;

                case 2:
                    if (contatos.isEmpty()) {
                        System.out.println("A agenda está vazia.");
                    } else {
                        for (int i = 0; i < contatos.size(); i++) {
                            System.out.print((i + 1) + ". ");
                            contatos.get(i).exibirDados();
                        }
                        System.out.println("Total de contatos: " + contatos.size());
                    }
                    break;

                case 3:
                    System.out.print("Nome a buscar: ");
                    String busca = sc.nextLine();
                    boolean achou = false;
                    for (Contato c : contatos) {
                        if (c.getNome().toLowerCase().contains(busca.toLowerCase())) {
                            c.exibirDados();
                            achou = true;
                        }
                    }
                    if (!achou) System.out.println("Nenhum contato encontrado.");
                    break;

                case 4:
                    // Seguindo a Foto 3: Listar numerado para remover por índice
                    if (contatos.isEmpty()) {
                        System.out.println("Nada para remover.");
                    } else {
                        for (int i = 0; i < contatos.size(); i++) {
                            System.out.println((i + 1) + " - " + contatos.get(i).getNome());
                        }
                        System.out.print("Número do contato a ser excluído: ");
                        int indice = sc.nextInt() - 1;
                        
                        if (indice >= 0 && indice < contatos.size()) {
                            contatos.remove(indice);
                            System.out.println("Removido com sucesso!");
                        } else {
                            System.out.println("Índice inválido!");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 5);

        sc.close();
    }
}