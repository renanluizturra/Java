package Exercício_encapsulamento;

import java.util.Scanner;

public class Exercicio_5main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = sc.nextLine();

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        Exercicio_5 aluno = new Exercicio_5(nome, nota1, nota2);

        aluno.mostrarSituacao();

        sc.close();
    }
}