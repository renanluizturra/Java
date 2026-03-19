package exercícios_condicional;

import java.util.Scanner;

public class exercicio_7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        String nome = input.nextLine();

        System.out.println("Digite o sexo (F ou M): ");
        String sexo = input.nextLine();

        System.out.println("Digite a idade: ");
        int idade = input.nextInt();

        if ((sexo.equals("F") || sexo.equals("f")) && idade < 25) {
            System.out.println(nome + " - ACEITA");
        } else {
            System.out.println(nome + " - NÃO ACEITA");
        }

        input.close();
    }
}