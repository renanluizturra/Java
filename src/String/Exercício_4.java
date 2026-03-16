package String;

import java.util.Scanner;

public class Exercício_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();

        // Primeira e última letra
        char primeira = palavra.charAt(0);
        char ultima = palavra.charAt(palavra.length() - 1);

        System.out.println("Primeira letra: " + primeira);
        System.out.println("Última letra: " + ultima);

        // Contar vogais
        int contador = 0;
        String vogais = "aeiouAEIOU";

        for (int i = 0; i < palavra.length(); i++) {
            if (vogais.indexOf(palavra.charAt(i)) != -1) {
                contador++;
            }
        }

        System.out.println("Quantidade de vogais: " + contador);

        // Palavra invertida
        String invertida = "";

        for (int i = palavra.length() - 1; i >= 0; i--) {
            invertida += palavra.charAt(i);
        }

        System.out.println("Palavra invertida: " + invertida);

        sc.close();
    }
}