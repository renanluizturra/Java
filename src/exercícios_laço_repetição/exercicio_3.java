package exercícios_laço_repetição;

import java.util.Scanner;

public class exercicio_3{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero = 1;
        int soma = 0;
        int contador = 0;

        while (numero > 0) {

            System.out.println("Digite um número positivo (0 para parar): ");
            numero = input.nextInt();

            if (numero > 0) {
                soma += numero;
                contador++;
            }
        }

        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.println("Média: " + media);
        } else {
            System.out.println("Nenhum número válido digitado.");
        }

        input.close();
    }
}
