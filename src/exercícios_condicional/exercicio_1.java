package exercícios_condicional;

import java.util.Scanner;

public class exercicio_1 {
   
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int num1 = input.nextInt();

        System.out.println("Digite o segundo valor: ");
        int num2 = input.nextInt();

        int soma = num1 + num2;

        if (soma > 10) {
            System.out.println("A soma é: " + soma);
        } else {
            System.out.println("A soma é menor ou igual a 10.");
        }

        input.close();
    }
}
