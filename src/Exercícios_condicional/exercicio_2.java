package Exercícios_condicional;

import java.util.Scanner;

public class exercicio_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = input.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = input.nextInt();

        int soma = num1 + num2;

        if (soma <= 20) {
            soma = soma - 5;
        }

        System.out.println("Resultado final: " + soma);

        input.close();
    }
}
