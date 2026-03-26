package exercicio_polimorfismo;

import java.util.ArrayList;
import java.util.Scanner; 

public class SistemaFuncionarios {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		ArrayList<Funcionario> func = new ArrayList<>();
		
		int opcao;
		
		do {
			
		System.out.println("MENU PRINCIPAL");
		System.out.println("1. Cadastrar Gerente");
		System.out.println("2. Cadastrar Vendedor");
		System.out.println("3. Cadastrar Programador");
		System.out.println("4. Listar todos os contracheques");
		System.out.println("5. Calcular folha de pagamento total");
		System.out.println("6. Buscar funcionário por nome");
		System.out.println("0. Sair");
		opcao = sc.nextInt();
		sc.nextLine();
		switch (opcao) {

        case 1:
            System.out.print("Nome: ");
            String nomeG = sc.nextLine();
            System.out.print("Salário base: ");
            double salG = sc.nextDouble();
            System.out.print("Bônus: ");
            double bonus = sc.nextDouble();

            func.add(new Gerente(nomeG, salG, bonus));
            break;

        case 2:
            System.out.print("Nome: ");
            String nomeV = sc.nextLine();
            System.out.print("Salário base: ");
            double salV = sc.nextDouble();
            System.out.print("Total vendas: ");
            double vendas = sc.nextDouble();
            System.out.print("Comissão (%): ");
            double com = sc.nextDouble() / 100;

            func.add(new Vendedor(nomeV, salV, vendas, com));
            break;

        case 3:
            System.out.print("Nome: ");
            String nomeP = sc.nextLine();
            System.out.print("Salário base: ");
            double salP = sc.nextDouble();
            System.out.print("Horas extras: ");
            int horas = sc.nextInt();
            System.out.print("Valor hora extra: ");
            double valor = sc.nextDouble();

            func.add(new Programador(nomeP, salP, horas, valor));
            break;

        case 4:
            for (Funcionario f : func) {
                f.exibirContracheque(); // POLIMORFISMO
            }
            break;

        case 5:
            double total = 0;
            for (Funcionario f : func) {
                total += f.calcularSalario(); // POLIMORFISMO
            }
            System.out.printf("Folha total: R$ %.2f\n", total);
            break;

        case 6:
            System.out.print("Digite o nome: ");
            String busca = sc.nextLine();
            boolean encontrou = false;

            for (Funcionario f : func) {
                if (f.getNome().equalsIgnoreCase(busca)) {
                    f.exibirContracheque();
                    encontrou = true;
                }
            }

            if (!encontrou) {
                System.out.println("Funcionário não encontrado!");
            }
            break;

        case 0:
            System.out.println("Saindo...");
            break;

        default:
            System.out.println("Opção inválida!");
       }

sc.close();
		}while (opcao != 0);

	
	}

}


