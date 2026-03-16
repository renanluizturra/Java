package Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        int soma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros.add(sc.nextInt());
        }

        // Soma
        for (int num : numeros) {
            soma += num;
        }

        double media = (double) soma / numeros.size();

        // Mostrando como vetor []
        System.out.println("\nVetor: " + numeros);

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);

        sc.close();
    }
}