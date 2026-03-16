package Exercícios_condicional;

import java.util.Scanner;

public class exercicio_8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int n1 = input.nextInt();

        System.out.println("Digite o segundo número: ");
        int n2 = input.nextInt();

        if (n1 > n2) {
            System.out.println("O maior número é: " + n1);
        } else {
            System.out.println("O maior número é: " + n2);
        }

        input.close();
    }
}
