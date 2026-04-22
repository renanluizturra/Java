package prova;

import java.util.ArrayList;
import java.util.Scanner;

public class EscolaMain {
    public static void main(String[] args) {
        ArrayList<Pessoa> registros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== SECRETARIA ESCOLAR ===");
            System.out.println("1. Registrar Pessoa (Geral ou Aluno)");
            System.out.println("2. Listar Todos os Registros");
            System.out.println("3. Buscar por Nome");
            System.out.println("4. Remover Registro");
            System.out.println("5. Sair");
            System.out.print("Opção: ");

            opcao = sc.nextInt();
            sc.nextLine(); // Limpeza de buffer

            switch (opcao) {
                case 1:
                    System.out.print("Tipo: (1) Pessoa Geral ou (2) Aluno? ");
                    int tipo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("ID (Matrícula): ");
                    int id = sc.nextInt();

                    if (tipo == 1) {
                        registros.add(new Pessoa(nome, id));
                        System.out.println("Pessoa registrada!");
                    } else if (tipo == 2) {
                        System.out.print("Nota final: ");
                        double nota = sc.nextDouble();
                        registros.add(new Aluno(nome, id, nota));
                        System.out.println("Aluno registrado!");
                    }
                    break;

                case 2:
                    System.out.println("\n--- LISTA DE MEMBROS DA ESCOLA ---");
                    if (registros.isEmpty()) System.out.println("Nenhum registro encontrado.");
                    for (int i = 0; i < registros.size(); i++) {
                        System.out.print((i + 1) + ". ");
                        registros.get(i).mostrarDados(); // Chamada polimórfica
                    }
                    break;

                case 3:
                    System.out.print("Nome para pesquisa: ");
                    String pesquisa = sc.nextLine();
                    boolean encontrou = false;
                    for (Pessoa p : registros) {
                        if (p.getNome().toLowerCase().contains(pesquisa.toLowerCase())) {
                            p.mostrarDados();
                            encontrou = true;
                        }
                    }
                    if (!encontrou) System.out.println("Ninguém encontrado com esse nome.");
                    break;

                case 4:
                    if (registros.isEmpty()) {
                        System.out.println("Lista vazia.");
                    } else {
                        System.out.print("Número da linha para remover: ");
                        int index = sc.nextInt();
                        if (index >= 1 && index <= registros.size()) {
                            Pessoa removida = registros.remove(index - 1);
                            System.out.println(removida.getNome() + " removido(a) com sucesso.");
                        } else {
                            System.out.println("Índice inválido.");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Encerrando sistema escolar...");
                    break;
            }
        } while (opcao != 5);

        sc.close();
    }
}