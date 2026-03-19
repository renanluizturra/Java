package vetores;

public class Exercício_1 {

	    public static void main(String[] args) {

	        int[] vetor = {5, 8, 12, 3, 7};

	        int soma = 0;

	        for (int i = 0; i < vetor.length; i++) {
	            System.out.println("Elemento: " + vetor[i]);
	            soma += vetor[i];
	        }

	        System.out.println("Soma total: " + soma);
	    }
	}