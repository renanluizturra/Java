package Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Lista com 5 cores pré-definidas
        ArrayList<String> cores = new ArrayList<>();
        cores.add("Azul");
        cores.add("Vermelho");
        cores.add("Verde");
        cores.add("Amarelo");
        cores.add("Preto");

        System.out.print("Digite uma cor: ");
        String corDigitada = sc.nextLine();

        // Verificando se está na lista (ignorando maiúsc/minúsc)
        boolean encontrada = false;

        for (String cor : cores) {
            if (cor.equalsIgnoreCase(corDigitada)) {
                encontrada = true;
                break;
            }
        }

        if (encontrada) {
            System.out.println("A cor está na lista.");
        } else {
            System.out.println("A cor NÃO está na lista.");
        }

        sc.close();
    }
}