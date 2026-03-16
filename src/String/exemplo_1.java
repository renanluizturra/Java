package String;

import java.util.Scanner;

public class exemplo_1 {

    public static void main(String[] args) {

        System.out.println("Buscando texto");

        String email = "usuario@teste.com";

        boolean temArroba = email.contains("@");
        System.out.println("Email contém @ ? " + temArroba);

        int posicaoArroba = email.indexOf("@");
        System.out.println("Posição do @: " + posicaoArroba);

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu e-mail: ");
        String emailUser = sc.nextLine();

        if(emailUser.contains("@") && emailUser.contains(".")) {
            System.out.println("Email parece válido.");
        } else {
            System.out.println("Email INVÁLIDO. ");
        }

        sc.close();
    }
}
