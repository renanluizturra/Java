package String;

import java.util.Scanner;

public class Exercício_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu email: ");
        String email = sc.nextLine().trim();

        int posArroba = email.indexOf("@");
        int posPonto = email.lastIndexOf(".");

        if (posArroba > 0 && posPonto > posArroba) {

            String usuario = email.substring(0, posArroba);
            String dominio = email.substring(posArroba + 1);

            System.out.println("Email válido!");
            System.out.println("Usuário: " + usuario);
            System.out.println("Domínio: " + dominio);

        } else {
            System.out.println("Email inválido.");
        }

        sc.close();
    }
}