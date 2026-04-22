package prova;

import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaMain {
    public static void main(String[] args) {
        ArrayList<Livro> acervo = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- SISTEMA DA BIBLIOTECA ---");
            System.out.println("1. Cadastrar Obra");
            System.out.println("2. Listar Acervo");
            System.out.println("3. Pesquisar por Título");
            System.out.println("4. Remover do Acervo");
            System.out.println("5. Sair");
            System.out.print("Escolha: ");

            opcao = teclado.nextInt();
            teclado.nextLine(); // Limpa buffer

            switch (opcao) {
                case 1:
                    System.out.print("Tipo: (1) Físico ou (2) Digital? ");
                    int tipo = teclado.nextInt();
                    teclado.nextLine();

                    System.out.print("Título: ");
                    String t = teclado.nextLine();
                    System.out.print("Autor: ");
                    String a = teclado.nextLine();

                    if (tipo == 1) {
                        acervo.add(new Livro(t, a));
                        System.out.println("Livro físico cadastrado!");
                    } else if (tipo == 2) {
                        System.out.print("Formato (PDF/EPUB/etc): ");
                        String f = teclado.nextLine();
                        acervo.add(new LivroDigital(t, a, f));
                        System.out.println("E-book cadastrado!");
                    }
                    break;

                case 2:
                    System.out.println("\n--- LISTA DE OBRAS ---");
                    if (acervo.isEmpty()) System.out.println("Nenhum livro no acervo.");
                    for (int i = 0; i < acervo.size(); i++) {
                        System.out.print((i + 1) + ". ");
                        acervo.get(i).exibirDados(); // Chama a versão certa de exibirDados
                    }
                    break;

                case 3:
                    System.out.print("Buscar título: ");
                    String busca = teclado.nextLine();
                    boolean achou = false;
                    for (Livro l : acervo) {
                        if (l.getTitulo().toLowerCase().contains(busca.toLowerCase())) {
                            l.exibirDados();
                            achou = true;
                        }
                    }
                    if (!achou) System.out.println("Livro não encontrado.");
                    break;

                case 4:
                    if (acervo.isEmpty()) {
                        System.out.println("Acervo vazio.");
                    } else {
                        System.out.print("Número do registro para remover: ");
                        int index = teclado.nextInt();
                        if (index >= 1 && index <= acervo.size()) {
                            Livro removido = acervo.remove(index - 1);
                            System.out.println("Obra '" + removido.getTitulo() + "' removida.");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Encerrando biblioteca...");
                    break;
            }
        } while (opcao != 5);

        teclado.close();
    }
}