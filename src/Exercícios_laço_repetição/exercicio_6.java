package Exercícios_laço_repetição;


import java.math.BigInteger;

public class exercicio_6 {

    public static void main(String[] args) {

        BigInteger produto = BigInteger.ONE;

        for (int i = 120; i <= 300; i++) {
            produto = produto.multiply(BigInteger.valueOf(i));
        }

        System.out.println("Produto: ");
        System.out.println(produto);
    }
}