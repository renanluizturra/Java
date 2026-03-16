package Encapsulamento;

import java.util.Scanner;

public class ListaNomesmain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ListaNomes lista = new ListaNomes();
		//classe virou Objeto > lista
		
		int opcao;
		
		do {
			System.out.println("\n==LISTA DE NOMES==");
			System.out.println("1. Adicionar nome");
			System.out.println("2. Listar nomes");
			System.out.println("3. Remover nome ");
			System.out.println("4. Buscar nome ");
			System.out.println("0. Sair ");
			System.out.println("Escolha:  ");
			
			opcao = sc.nextInt();
			//limpeza do enter (\n)
			sc.nextLine();
			
			switch (opcao) {
			
			case 1:
				System.out.println("Nome: ");
				String nomeDigitado = sc.nextLine();
				lista.adicionarNome(nomeDigitado);
				//Chamo o objeto com o método
				 
				break;
				
			case 2:
				lista.listarnomes();
				break;
				
			case 3:
				System.out.println("Qual nome deseja remover?");
				String remover = sc.nextLine();
				lista.removerNome(remover);
				break;
				
			case 4:
				System.out.println("Nome: ");
				String busca = sc.nextLine();
				lista.buscarNome(busca);
				break;
				
			case 0:
				System.out.println("Eu te amo em Coreano...Tchau");
				break;
				
			default:
				System.out.println("Opção ERRADA");
				break;  
				
			}
			
		} while (opcao !=0);
		sc.close();
		
				
				

	}

}
