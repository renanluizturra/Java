package Exercícios_condicional;

import java.util.Scanner;

public class exercicio_5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = input.nextInt();

        if (numero >= 20 && numero <= 90) {
            System.out.println("O número está entre 20 e 90.");
        } else {
            System.out.println("O número NÃO está entre 20 e 90.");
        }

        input.close();
    }
}
