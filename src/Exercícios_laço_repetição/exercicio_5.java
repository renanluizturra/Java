package Exercícios_laço_repetição;

import java.util.*;

public class exercicio_5 {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);

	        String nome = "";

	        while (!nome.equalsIgnoreCase("FIM")) {

	            System.out.println("Digite um nome (FIM para parar): ");
	            nome = input.nextLine();

	            if (!nome.equalsIgnoreCase("FIM")) {
	                System.out.println("Nome digitado: " + nome);
	            }
	        }

	        input.close();
	    }
	}