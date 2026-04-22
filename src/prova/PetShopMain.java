package prova;

import java.util.ArrayList;
import java.util.Scanner;

public class PetShopMain {
    public static void main(String[] args) {
        ArrayList<Animal> listaAnimais = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- SISTEMA PET SHOP ---");
            System.out.println("1. Cadastrar Animal (Genérico ou Cachorro)");
            System.out.println("2. Ver Todos e Ouvir Sons");
            System.out.println("3. Buscar por Nome");
            System.out.println("4. Remover Animal");
            System.out.println("5. Sair");
            System.out.print("Escolha: ");

            opcao = leitor.nextInt();
            leitor.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Tipo: (1) Animal Geral ou (2) Cachorro? ");
                    int tipo = leitor.nextInt();
                    leitor.nextLine();

                    System.out.print("Nome: ");
                    String nome = leitor.nextLine();
                    System.out.print("Idade: ");
                    int idade = leitor.nextInt();
                    leitor.nextLine();

                    if (tipo == 1) {
                        listaAnimais.add(new Animal(nome, idade));
                        System.out.println("Animal cadastrado!");
                    } else if (tipo == 2) {
                        System.out.print("Raça: ");
                        String raca = leitor.nextLine();
                        listaAnimais.add(new Cachorro(nome, idade, raca));
                        System.out.println("Cachorro cadastrado!");
                    }
                    break;

                case 2:
                    System.out.println("\n--- LISTA DE ANIMAIS ---");
                    for (int i = 0; i < listaAnimais.size(); i++) {
                        System.out.print((i + 1) + ". ");
                        listaAnimais.get(i).emitirSom(); // Polimorfismo puro aqui!
                    }
                    break;

                case 3:
                    System.out.print("Nome para buscar: ");
                    String busca = leitor.nextLine();
                    boolean achou = false;
                    for (Animal a : listaAnimais) {
                        if (a.getNome().equalsIgnoreCase(busca)) {
                            a.emitirSom();
                            achou = true;
                        }
                    }
                    if (!achou) System.out.println("Animal não encontrado.");
                    break;

                case 4:
                    if (!listaAnimais.isEmpty()) {
                        System.out.print("Número para remover: ");
                        int n = leitor.nextInt();
                        if (n >= 1 && n <= listaAnimais.size()) {
                            Animal r = listaAnimais.remove(n - 1);
                            System.out.println(r.getNome() + " saiu da lista.");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Tchau!");
                    break;
            }
        } while (opcao != 5);

        leitor.close();
    }
}