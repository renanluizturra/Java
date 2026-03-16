package Exercícios_condicional;

import java.util.Scanner;

public class exercicio_6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = input.nextInt();

        if (numero > 20) {
            System.out.println("Maior do que 20.");
        } else if (numero == 20) {
            System.out.println("Igual a 20.");
        } else {
            System.out.println("Menor do que 20.");
        }

        input.close();
    }
}
