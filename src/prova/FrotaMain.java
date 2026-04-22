package prova;

import java.util.ArrayList;
import java.util.Scanner;

public class FrotaMain {
    public static void main(String[] args) {
        // Lista polimórfica: aceita Veiculo e Caminhao
        ArrayList<Veiculo> listaVeiculos = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- GESTÃO DE FROTA ---");
            System.out.println("1. Cadastrar Veículo");
            System.out.println("2. Listar Frota");
            System.out.println("3. Buscar por Placa");
            System.out.println("4. Remover Veículo");
            System.out.println("5. Sair");
            System.out.print("Escolha: ");
            
            opcao = leitor.nextInt();
            leitor.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Tipo: (1) Carro de Passeio ou (2) Caminhão? ");
                    int tipo = leitor.nextInt();
                    leitor.nextLine();

                    System.out.print("Placa: ");
                    String placa = leitor.nextLine();
                    System.out.print("Modelo: ");
                    String modelo = leitor.nextLine();

                    if (tipo == 1) {
                        listaVeiculos.add(new Veiculo(placa, modelo));
                        System.out.println("Veículo cadastrado!");
                    } else if (tipo == 2) {
                        System.out.print("Capacidade de Carga (ton): ");
                        double carga = leitor.nextDouble();
                        listaVeiculos.add(new Caminhao(placa, modelo, carga));
                        System.out.println("Caminhão cadastrado!");
                    }
                    break;

                case 2:
                    System.out.println("\n--- LISTA DE VEÍCULOS ---");
                    for (int i = 0; i < listaVeiculos.size(); i++) {
                        System.out.print((i + 1) + ". ");
                        listaVeiculos.get(i).exibirDetalhes(); // Polimorfismo em ação
                    }
                    break;

                case 3:
                    System.out.print("Digite a placa para busca: ");
                    String busca = leitor.nextLine();
                    boolean achou = false;
                    for (Veiculo v : listaVeiculos) {
                        if (v.getPlaca().equalsIgnoreCase(busca)) {
                            v.exibirDetalhes();
                            achou = true;
                        }
                    }
                    if (!achou) System.out.println("Veículo não encontrado.");
                    break;

                case 4:
                    if (listaVeiculos.isEmpty()) {
                        System.out.println("Nada para remover.");
                    } else {
                        System.out.print("Índice do veículo a remover: ");
                        int index = leitor.nextInt();
                        if (index >= 1 && index <= listaVeiculos.size()) {
                            listaVeiculos.remove(index - 1);
                            System.out.println("Removido com sucesso.");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;
            }
        } while (opcao != 5);

        leitor.close();
    }
}