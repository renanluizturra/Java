	package exercicios_excecoes;

	import java.util.Scanner;

	public class Exercicio_5 {

		 public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        try {

		            System.out.print("Digite sua idade: ");
		            int idade = sc.nextInt();

		            if (idade < 18) {
		                System.out.println("Erro: Idade não permitida.");
		            } else {
		                System.out.println("Acesso permitido!");
		            }

		        } catch (Exception e) {
		            System.out.println("ERRO!!! Escreva sua idade ");
		            System.out.println(e.getMessage());
		            
		            
		        }

		        sc.close();
		    }
		}
	