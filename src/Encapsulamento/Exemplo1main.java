package Encapsulamento;

import java.util.Scanner;

public class Exemplo1main {

	public static void main(String[] args) {
		Exemplo1 ex1 = new Exemplo1 ("Aurino", 67);
		
		/* System.out.println(ex1.getNome()+ "\n"+ ex1.getIdade());
		// alterar
		ex1.setNome("Betinho");
		System.out.println(ex1.getNome()); */
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite seu nome: ");
		String nomeDigitado = sc.nextLine();
		
		System.out.println("Digite sua idade: ");
		int idadeDigitada = sc.nextInt();
		
		Exemplo1 Ex2 = new Exemplo1 (nomeDigitado, idadeDigitada);
		System.out.println(Ex2.getNome());
		System.out.println(Ex2.getIdade());
		sc.close();
		
		
		
	}

}
