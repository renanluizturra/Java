package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nomes.add(sc.nextLine());
        }

        // Mostra igual vetor
        System.out.println("\nVetor: " + nomes);

        sc.close();
    }
}