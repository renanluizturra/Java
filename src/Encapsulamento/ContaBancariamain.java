package Encapsulamento;

import java.util.Scanner;

public class ContaBancariamain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o saldo inicial: ");
        double saldoInicial = sc.nextDouble();

        ContaBancaria conta = new ContaBancaria(saldoInicial);

        System.out.println("Digite um valor para depósito: ");
        double deposito = sc.nextDouble();
        conta.depositar(deposito);

        System.out.println("Digite um valor para SAQUE: ");
        double saque = sc.nextDouble();
        conta.sacar(saque);

        double saldoAtual = conta.consultarSaldo();

        System.out.println("Saldo atual da conta: " + saldoAtual);

        sc.close();
    }
}