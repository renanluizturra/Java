package exercicios_excecoes;

import java.util.Scanner;

public class Exercicio_4 {

	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        try {

	            System.out.print("Digite um número inteiro: ");
	            int numero = sc.nextInt();

	            if (numero <= 0) {
	                System.out.println("Erro: número deve ser maior que zero.");
	            } else {
	                System.out.println("Número válido!");
	            }

	        } catch (Exception e) {
	            System.out.println("ERRO!!! Escreva o número ");
	            e.printStackTrace();
	        }

	        sc.close();
	    }
	}