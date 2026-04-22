package prova;

import java.util.ArrayList;
import java.util.Scanner;

public class RHMain {
    public static void main(String[] args) {
        ArrayList<Funcionario> listaRH = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== SISTEMA DE RECURSOS HUMANOS ===");
            System.out.println("1. Contratar (Funcionário ou Gerente)");
            System.out.println("2. Listar Quadro de Funcionários");
            System.out.println("3. Buscar por Nome");
            System.out.println("4. Demitir (Remover)");
            System.out.println("5. Sair");
            System.out.print("Ação: ");

            opcao = entrada.nextInt();
            entrada.nextLine(); // Limpeza

            switch (opcao) {
                case 1:
                    System.out.print("Tipo: (1) Comum ou (2) Gerente? ");
                    int tipo = entrada.nextInt();
                    entrada.nextLine();

                    System.out.print("Nome: ");
                    String nome = entrada.nextLine();
                    System.out.print("Salário: ");
                    double sal = entrada.nextDouble();
                    entrada.nextLine();

                    if (tipo == 1) {
                        listaRH.add(new Funcionario(nome, sal));
                        System.out.println("Funcionário cadastrado!");
                    } else if (tipo == 2) {
                        System.out.print("Departamento: ");
                        String dep = entrada.nextLine();
                        listaRH.add(new Gerente(nome, sal, dep));
                        System.out.println("Gerente cadastrado!");
                    }
                    break;

                case 2:
                    System.out.println("\n--- LISTA ATUAL ---");
                    for (int i = 0; i < listaRH.size(); i++) {
                        System.out.print((i + 1) + ". ");
                        listaRH.get(i).mostrarPerfil(); // Chamada polimórfica
                    }
                    break;

                case 3:
                    System.out.print("Nome para busca: ");
                    String busca = entrada.nextLine();
                    boolean encontrado = false;
                    for (Funcionario f : listaRH) {
                        if (f.getNome().toLowerCase().contains(busca.toLowerCase())) {
                            f.mostrarPerfil();
                            encontrado = true;
                        }
                    }
                    if (!encontrado) System.out.println("Nenhum registro com esse nome.");
                    break;

                case 4:
                    if (listaRH.isEmpty()) {
                        System.out.println("Nenhum funcionário para remover.");
                    } else {
                        System.out.print("Número da linha para demitir: ");
                        int index = entrada.nextInt();
                        if (index >= 1 && index <= listaRH.size()) {
                            Funcionario removido = listaRH.remove(index - 1);
                            System.out.println(removido.getNome() + " removido do sistema.");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Finalizando...");
                    break;
            }
        } while (opcao != 5);

        entrada.close();
    }
}