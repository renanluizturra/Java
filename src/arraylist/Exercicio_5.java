package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> palavras = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a palavra " + (i + 1) + ": ");
            palavras.add(sc.nextLine());
        }

        System.out.print("\nVetor invertido: [");

        for (int i = palavras.size() - 1; i >= 0; i--) {
            System.out.print(palavras.get(i));

            if (i != 0) {
                System.out.print(", ");
            }
        }

        System.out.println("]");

        sc.close();
    }
}