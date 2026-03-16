package String;

import java.util.Scanner;

public class Exercício_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
        String nome = sc.nextLine().trim(); // remove espaços extras

        if (nome.length() >= 5 && nome.contains(" ")) {
            System.out.println("Nome válido: " + nome.toUpperCase());
        } else {
            System.out.println("Nome inválido. Digite nome e sobrenome corretamente.");
        }

        sc.close();
    }
}