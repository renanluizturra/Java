package exercicio_polimorfismo;

	import java.util.ArrayList;
	import java.util.Scanner;

	public class SistemaTransportes {
		
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        ArrayList<Transporte> lista = new ArrayList<>();

	        int opcao;

	        do {
	            System.out.println("MENU");
	            System.out.println("1 - Adicionar Carro");
	            System.out.println("2 - Adicionar Ônibus");
	            System.out.println("3 - Adicionar Bicicleta");
	            System.out.println("4 - Listar todos");
	            System.out.println("5 - Custo total");
	            System.out.println("0 - Sair");
	            System.out.print("Escolha: ");
	            opcao = sc.nextInt();
	            sc.nextLine();

	            switch (opcao) {

	                case 1:
	                    System.out.print("Distância: ");
	                    double d1 = sc.nextDouble();

	                    System.out.print("Passageiros: ");
	                    int p1 = sc.nextInt();
	                    sc.nextLine();

	                    System.out.print("Combustível: ");
	                    String comb = sc.nextLine();

	                    lista.add(new Carro(d1, p1, comb));
	                    break;

	                case 2:
	                    System.out.print("Distância: ");
	                    double d2 = sc.nextDouble();

	                    System.out.print("Passageiros: ");
	                    int p2 = sc.nextInt();

	                    System.out.print("Número de linhas: ");
	                    int linhas = sc.nextInt();

	                    lista.add(new Onibus(d2, p2, linhas));
	                    break;

	                case 3:
	                    System.out.print("Distância: ");
	                    double d3 = sc.nextDouble();

	                    System.out.print("Passageiros: ");
	                    int p3 = sc.nextInt();
	                    sc.nextLine();

	                    System.out.print("Tipo de freio: ");
	                    String freio = sc.nextLine();

	                    lista.add(new Bicicleta(d3, p3, freio));
	                    break;

	                case 4:
	                    if (lista.isEmpty()) {
	                        System.out.println("Lista vazia!");
	                    } else {
	                        for (Transporte t : lista) {
	                            t.exibirDetalhes(); // POLIMORFISMO
	                        }
	                    }
	                    break;

	                case 5:
	                    double total = 0;
	                    for (Transporte t : lista) {
	                        total += t.calcularCusto(); // POLIMORFISMO
	                    }
	                    System.out.printf("Custo total: R$ %.2f\n", total);
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

