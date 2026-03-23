package polimorfismo;

import java.util.Scanner;
import java.util.ArrayList;

public class PagamentoMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Pagamento> pagamentos = new ArrayList<>();
		
		int opcao;
		
		do {
			System.out.println("MENU PRINCIPAL ");
			System.out.println("1 - CARTÃO DE CREDITO ");
			System.out.println("2 - PIX");
			System.out.println("3 - BOLETO");
			System.out.println("4 - Listar todos os pagamentos");
			System.out.println("5 - Calcular total das taxas. ");
			System.out.println("0. Sair");
			
			opcao= sc.nextInt();
			sc.nextLine();//buffer
			
			switch(opcao) {
			case 1:
				System.out.println("Pagamento com CARTÃO");
				System.out.println("Titular: ");
				String titularCartao = sc.nextLine();
				
				System.out.println("Valor: R$ ");
				double valorCartao = sc.nextDouble();
				sc.nextLine(); //buffer
				
				System.out.println("Número do cartão: ");
				String numeroCartao = sc.nextLine();
				
				//classe pai-Tipo Pai e Objeto classe filha
				Pagamento pagCartao = new CartaoCredito(titularCartao, valorCartao, numeroCartao);
				pagCartao.processarPagamento();
				pagamentos.add(pagCartao);
				
				break;
				
			}
			
		}while(opcao !=0);
		
		
		
	}

}
