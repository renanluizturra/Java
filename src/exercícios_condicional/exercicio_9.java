package exercícios_condicional;

import java.util.Scanner;

public class exercicio_9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = input.nextInt();

        if (numero % 3 == 0) {
            System.out.println("É múltiplo de 3.");
        } else {
            System.out.println("Não é múltiplo de 3.");
        }

        input.close();
    }
}
