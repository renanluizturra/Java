package exercicios_excecoes;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Digite um numero: ");
			int n1 = sc.nextInt();

	}catch(Exception e) {
		System.out.println("ERRO! Digite um numero inteiro.");
		e.printStackTrace();
	}
		System.out.println("Sistema continua. ");
	
	
	}
}
