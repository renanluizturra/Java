package exercicios_excecoes;

import java.util.Scanner;

public class Exercicio_6 {

	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        try {
	            System.out.print("Digite a senha: ");
	            String senha = sc.nextLine();

	            if (senha.length()< 6) {
	            throw new Exception("Erro: senha deve 6 numeros.");
	            }

	            System.out.println("Senha válida!");

	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }

	        sc.close();
	    }
	}