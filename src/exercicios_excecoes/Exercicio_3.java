package exercicios_excecoes;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Digite um numero: ");
			int n1 = sc.nextInt();
			
			System.out.println("Digite outro numero: ");
			int n2 = sc.nextInt();
			
			int divisao = n1/n2;
			
			System.out.println("Resultado: " + divisao);
			
		

	}catch(Exception e) {
		System.out.println("ERRO! Digite um numero inteiro.");
		e.printStackTrace();
	
		
	}finally {
        System.out.println("Sistema continua. ");
        //throw cria o erro
        //catch resolve o erro.
    }
}
}


