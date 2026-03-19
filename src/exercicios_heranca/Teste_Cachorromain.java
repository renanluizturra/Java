package exercicios_heranca;

import java.util.Scanner;

public class Teste_Cachorromain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("==DADOS DO ANIMAL==");
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Idade: ");
		int idade = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Raça: ");
		String raca = sc.nextLine();
		
		Cachorro cachorro_animal = new Cachorro(nome, idade, raca);
		cachorro_animal.exibirDados();
		
}

}
