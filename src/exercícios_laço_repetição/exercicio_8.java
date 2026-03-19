package exercícios_laço_repetição;

import java.util.Scanner;

public class exercicio_8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int idade;
        int menos21 = 0;
        int mais50 = 0;

        System.out.println("Digite a idade (fora de 0-120 para parar): ");
        idade = input.nextInt();

        while (idade >= 0 && idade <= 120) {

            if (idade < 21) {
                menos21++;
            }

            if (idade > 50) {
                mais50++;
            }

            System.out.println("Digite a idade (fora de 0-120 para parar): ");
            idade = input.nextInt();
        }

        System.out.println("Total com menos de 21 anos: " + menos21);
        System.out.println("Total com mais de 50 anos: " + mais50);

        input.close();
    }
}
