package exercícios_condicional;

import java.util.Scanner;

public class exercicio_4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int n1 = input.nextInt();

        System.out.println("Digite o segundo número: ");
        int n2 = input.nextInt();

        System.out.println("Digite o terceiro número: ");
        int n3 = input.nextInt();

        int menor, meio, maior;

        // menor
        if (n1 < n2 && n1 < n3) {
            menor = n1;
        } else if (n2 < n1 && n2 < n3) {
            menor = n2;
        } else {
            menor = n3;
        }

        // maior
        if (n1 > n2 && n1 > n3) {
            maior = n1;
        } else if (n2 > n1 && n2 > n3) {
            maior = n2;
        } else {
            maior = n3;
        }

        // meio
        meio = n1 + n2 + n3 - menor - maior;

        System.out.println("Ordem crescente: " + menor + ", " + meio + ", " + maior);

        input.close();
    }
}