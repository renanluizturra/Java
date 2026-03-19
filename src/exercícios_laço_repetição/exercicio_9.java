package exercícios_laço_repetição;

import java.util.Scanner;

public class exercicio_9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero;
        int contadorPrimos = 0;

        System.out.println("Digite números positivos (não positivo para parar): ");
        numero = input.nextInt();

        while (numero > 0) {

            boolean primo = true;

            if (numero == 1) {
                primo = false;
            } else {
                for (int i = 2; i <= numero / 2; i++) {
                    if (numero % i == 0) {
                        primo = false;
                        break;
                    }
                }
            }

            if (primo) {
                contadorPrimos++;
            }

            numero = input.nextInt();
        }

        System.out.println("Quantidade de números primos digitados: " + contadorPrimos);

        input.close();
    }
}
