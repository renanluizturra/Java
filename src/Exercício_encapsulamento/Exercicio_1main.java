package Exercício_encapsulamento;

import java.util.Scanner;
public class Exercicio_1main {

		public static void main(String[] args) {
			Exercicio_1 ex1 = new Exercicio_1 ("Aurino", 67);
			
			/* System.out.println(ex1.getNome()+ "\n"+ ex1.getIdade());
			// alterar
			ex1.setNome("Betinho");
			System.out.println(ex1.getNome()); */
			
			Scanner sc = new Scanner (System.in);
			System.out.println("Digite seu nome: ");
			String nomeDigitado = sc.nextLine();
			
			System.out.println("Digite sua idade: ");
			int idadeDigitada = sc.nextInt();
			
			Exercicio_1 Ex2 = new Exercicio_1 (nomeDigitado, idadeDigitada);
			System.out.println(Ex2.getNome());
			System.out.println(Ex2.getIdade());
			sc.close();
			
			
			
		}

	}
