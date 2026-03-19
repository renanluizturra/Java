package exercícios_laço_repetição;

	import java.util.Scanner;

	public class exercicio_4 {

	    public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);

	        int numero = 1;
	        int contador = 0;

	        while (numero != 0) {

	            System.out.println("Digite um número (0 para parar): ");
	            numero = scanner.nextInt();

	            if (numero >= 100 && numero <= 200) {
	                contador++;
	            }
	        }

	        System.out.println("Quantidade de números entre 100 e 200: " + contador);

	        scanner.close();
	    }
	}
