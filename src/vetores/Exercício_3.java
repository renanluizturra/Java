package vetores;

import java.util.Scanner;

public class Exercício_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];
        int[] vetorSoma = new int[5];

        // Preenchendo vetor 1
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o valor do vetor 1 posição " + i + ": ");
            vetor1[i] = input.nextInt();
        }

        // Preenchendo vetor 2
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o valor do vetor 2 posição " + i + ": ");
            vetor2[i] = input.nextInt();
        }

        // Somando vetores
        for (int i = 0; i < 5; i++) {
            vetorSoma[i] = vetor1[i] + vetor2[i];
        }

        // Exibindo resultado
        System.out.println("Vetor resultante da soma:");

        for (int i = 0; i < 5; i++) {
            System.out.println("Posição " + i + ": " + vetorSoma[i]);
        }

        input.close();
    }
}