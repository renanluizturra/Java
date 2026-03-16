package Exercícios_condicional;

import java.util.Scanner;

public class exercicio_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double numero = input.nextDouble();

        if (numero >= 0) {
            double raiz = Math.sqrt(numero);
            System.out.println("Raiz quadrada: " + raiz);
        } else {
            double quadrado = numero * numero;
            System.out.println("Quadrado do número: " + quadrado);
        }

        input.close();
    }
}
