package Vetores;

import java.util.Scanner;

public class Exercício_2 {


	    public static void main(String[] args) {

	        Scanner input = new Scanner(System.in);

	        int[] vetor = new int[5];
	        int soma = 0;

	        for (int i = 0; i < vetor.length; i++) {

	            System.out.println("Digite o número " + (i + 1) + ": ");
	            vetor[i] = input.nextInt();

	            soma += vetor[i];
	        }

	        System.out.println("Soma total: " + soma);

	        input.close();
	    }
	}