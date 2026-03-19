package arraylist;

import java.util.ArrayList;

public class Exercicio_2 {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }

        numeros.remove(Integer.valueOf(5));

        System.out.println("Lista atualizada:");
        for (Integer num : numeros) {
            System.out.print(num + " ");
        }

        System.out.println("\nTamanho da lista: " + numeros.size());
    }
}