package exercicios_heranca;

import java.util.Scanner;

public class Teste_Produtosmain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("==DADOS DO PRODUTO==");
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Preço: ");
		double preco = sc.nextDouble();
		
		System.out.println("Quantidade: ");
		int quantidade = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Autor: ");
		String autor = sc.nextLine();
		sc.nextLine();
		
		Livro produto = new Livro(nome, preco, quantidade, autor);

		System.out.println("==CADASTRO ELETRONICO==");
		System.out.println("Nome: ");
		nome = sc.nextLine();
		
		System.out.println("Preço: ");
		preco = sc.nextDouble();
		
		System.out.println("Quantidade: ");
		quantidade = sc.nextInt();
		sc.nextLine();
	
		System.out.println("Garantia Meses: ");
		String garantiaMeses = sc.nextLine();
		
		Eletronico c  = new Eletronico (nome, preco, quantidade, garantiaMeses);
		
		produto.exibirDados();
		c.exibirDados();
	}

}
